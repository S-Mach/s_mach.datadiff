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

  def build[A: c.WeakTypeTag,P: c.WeakTypeTag]() : c.Expr[DataDiff[A,P]] = {
    val aType = c.weakTypeOf[A]
    val pType = c.weakTypeOf[P]

    val productType = abortIfFailure(ProductType(aType))

    val lcs = ('a' to 'z').map(_.toString)

    val oomPatch = productType.oomField
      .zip(lcs)
      .map { case (ProductType.Field(fieldName,_type),lc) =>
        val field = TermName(fieldName)
        (TermName(lc),TermName(s"${lc}Patch"),field)
      }

    // TODO: there should be a proper why to get this using quasi-quotes
    val aCompanion = Ident(TermName(aType.typeSymbol.name.toString))
    val pCompanion = Ident(TermName(pType.typeSymbol.name.toString))
    val result = c.Expr[DataDiff[A,P]] {
      q"""
new DataDiff[$aType,$pType] {
  def calcDiff(oldValue: $aType, newValue: $aType) : Option[$pType] = {
    ..${
      oomPatch.map { case (_,patchName,field) =>
        q"val $patchName = oldValue.$field calcDiff newValue.$field"
      }
    }
    if(${
      oomPatch
        .map { case (_,patchName,_) =>
          q"$patchName.isEmpty".asInstanceOf[c.Tree]
        }
        .reduce { (a,b) => q"$a && $b"}
    }) {
      None
    } else {
      Some($pCompanion.apply(..${oomPatch.map(_._2)}))
    }
  }

  def applyPatch(value: $aType, patch: $pType) : $aType = {
    ..${
      oomPatch.map { case (lc,_,field) =>
        q"val $lc = patch.$field.fold(value.$field)(p => value.$field.applyPatch(p))"
      }
    }
    $aCompanion.apply(..${oomPatch.map(_._1)})
  }
}
      """
    }
    println(result)
    result
  }

}
