/*
                    ,i::,
               :;;;;;;;
              ;:,,::;.
            1ft1;::;1tL
              t1;::;1,
               :;::;               _____       __  ___              __
          fCLff ;:: tfLLC         / ___/      /  |/  /____ _ _____ / /_
         CLft11 :,, i1tffLi       \__ \ ____ / /|_/ // __ `// ___// __ \
         1t1i   .;;   .1tf       ___/ //___// /  / // /_/ // /__ / / / /
       CLt1i    :,:    .1tfL.   /____/     /_/  /_/ \__,_/ \___//_/ /_/
       Lft1,:;:       , 1tfL:
       ;it1i ,,,:::;;;::1tti      s_mach.datadiff
         .t1i .,::;;; ;1tt        Copyright (c) 2014 S-Mach, Inc.
         Lft11ii;::;ii1tfL:       Author: lance.gatlin@gmail.com
          .L1 1tt1ttt,,Li
            ...1LLLL...
*/
package s_mach.datadiff.impl


import scala.reflect.macros.blackbox
import s_mach.datadiff.DataDiff
import s_mach.codetools.{Result, BlackboxHelper}

class DataDiffMacroBuilderImpl(
  val c: blackbox.Context,
  override val showDebug: Boolean = false
) extends BlackboxHelper {
  import c.universe._
  
  case class FieldEx(
    aField: ProductType.Field,
    pField: ProductType.Field
  ) {
    val fieldTermName = TermName(aField.name)
    val dataDiffTermName = TermName(s"${aField.name}DataDiff")
    val patchTermName = TermName(s"${aField.name}Patch")
  }
  
  def build[A: c.WeakTypeTag,P: c.WeakTypeTag] : c.Expr[DataDiff[A,P]] =
    getOrAbort {
      Result.applicative(
        calcProductType(c.weakTypeOf[A]),
        calcProductType(c.weakTypeOf[P])
      )(build2)
    }

  def build2[A: c.WeakTypeTag,P: c.WeakTypeTag](
    aProductType: ProductType,
    pProductType: ProductType
  ) : Result[c.Expr[DataDiff[A,P]]] = {

    val aType = c.weakTypeOf[A]
    val pType = c.weakTypeOf[P]

    val oomFieldEx =
      aProductType.oomField
        .zip(pProductType.oomField)
        .map { case (aField,pField) =>
          FieldEx(
            aField = aField,
            pField = pField
          )
        }

    // TODO: there should be a proper why to get this using quasi-quotes
    val aCompanion = aProductType.companion
    val pCompanion = pProductType.companion

    val result = c.Expr[DataDiff[A,P]] {
      q"""
new DataDiff[$aType,$pType] {
  ..${
    oomFieldEx.map { field =>
      import field._
      q"val $dataDiffTermName = implicitly[DataDiff[${aField._type},${pField._type}]]"
    }
  }
  val noChange = $pCompanion.apply(
    ..${
      oomFieldEx.map { field =>
        import field._
        q"$dataDiffTermName.noChange"
      }
    }
  )

  def calcDiff(oldValue: $aType, newValue: $aType) : $pType = {
    ..${
      aProductType.mkFieldValsTree(
        value = q"oldValue",
        mkValName = { valName => "old" + valName },
        tupleName = "oldTuple"
      )
    }
    ..${
      aProductType.mkFieldValsTree(
        value = q"newValue",
        mkValName = { valName => "new" + valName },
        tupleName = "newTuple"
      )
    }
    ..${
      oomFieldEx.map { field =>
        import field._
        val oldTermName = TermName("old" + aField.name)
        val newTermName = TermName("new" + aField.name)
        q"val $patchTermName = $dataDiffTermName.calcDiff($oldTermName,$newTermName)"
      }
    }
    if(${
      oomFieldEx
        .map { field =>
          import field._
          q"$patchTermName == $dataDiffTermName.noChange".asInstanceOf[c.Tree]
        }
        .reduce { (a,b) => q"$a && $b"}
    }) {
      noChange
    } else {
      $pCompanion.apply(..${oomFieldEx.map(_.patchTermName)})
    }
  }

  def applyPatch(value: $aType, patch: $pType) : $aType = {
    if(patch != noChange) {
      ..${
        aProductType.mkFieldValsTree(
          value = q"value",
          mkValName = { valName => "value" + valName },
          tupleName = "valueTuple"
        )
      }
      ..${
        pProductType.mkFieldValsTree(
          value = q"patch",
          mkValName = { valName => "patch" + valName },
          tupleName = "patchTuple"
        )
      }
      ..${
        oomFieldEx.map { field =>
          import field._
          val valueTermName = TermName("value" + aField.name)
          val patchTermName = TermName("patch" + pField.name)
          q"val $fieldTermName = $valueTermName.applyPatch($patchTermName)"
        }
      }
      $aCompanion.apply(..${oomFieldEx.map(_.fieldTermName)})
    } else {
      value
    }
  }
}
      """
    }
    Result(result,Result.Debug(result.toString))
  }

}
