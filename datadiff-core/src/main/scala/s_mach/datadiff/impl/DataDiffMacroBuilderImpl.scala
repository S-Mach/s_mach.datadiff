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
import s_mach.datadiff.{DataDiffMacroBuilder, DataDiff}
import s_mach.codetools.BlackboxHelper

class DataDiffMacroBuilderImpl(val c: blackbox.Context) extends
  DataDiffMacroBuilder with
  BlackboxHelper {
  import c.universe._
  
  case class FieldEx(
    aFieldName: String,
    aFieldType: c.Type,
    pFieldName: String,
    pFieldType: c.Type
  ) {
    val fieldTermName = TermName(aFieldName)
    val dataDiffTermName = TermName(s"${aFieldName}DataDiff")
    val patchTermName = TermName(s"${aFieldName}Patch")
  }
  
  def build[A: c.WeakTypeTag,P: c.WeakTypeTag] : c.Expr[DataDiff[A,P]] = {
    val aType = c.weakTypeOf[A]
    val pType = c.weakTypeOf[P]

    val aProductType = abortIfFailure(ProductType(aType))
    val pProductType = abortIfFailure(ProductType(pType))

    val oomFieldEx =
      aProductType.oomField
        .zip(pProductType.oomField)
        .map { case (aField,pField) =>
          FieldEx(
            aFieldName = aField.fieldName,
            aFieldType = aField._type,
            pFieldName = pField.fieldName,
            pFieldType = pField._type
          )
        }

    // TODO: there should be a proper why to get this using quasi-quotes
    val aCompanion = Ident(TermName(aType.typeSymbol.name.toString))
    val pCompanion = Ident(TermName(pType.typeSymbol.name.toString))
    val result = c.Expr[DataDiff[A,P]] {
      q"""
new DataDiff[$aType,$pType] {
  ..${
    oomFieldEx.map { field =>
      import field._
      q"val $dataDiffTermName = implicitly[DataDiff[$aFieldType,$pFieldType]]"
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
      oomFieldEx.map { field =>
        import field._
        q"val $patchTermName = $dataDiffTermName.calcDiff(oldValue.$fieldTermName,newValue.$fieldTermName)"
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
        oomFieldEx.map { field =>
          import field._
          q"val $fieldTermName = if(patch.$fieldTermName == $dataDiffTermName.noChange) value.$fieldTermName else value.$fieldTermName.applyPatch(patch.$fieldTermName)"
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
//    println(result)
    result
  }

}
