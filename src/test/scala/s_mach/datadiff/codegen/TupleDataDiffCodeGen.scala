/*
                    ,i::,
               :;;;;;;;
              ;:,,::;.
            1ft1;::;1tL
              t1;::;1,
               :;::;               _____        __  ___              __
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
package s_mach.datadiff.codegen

object TupleDataDiffCodeGen {
  def gen(n: Int) = {
    val lcs = ('a' to 'z').map(_.toString).take(n)
    val ucs = ('A' to 'Z').map(_.toString).take(n)
    val allUcs = ucs.mkString(",")
    val allLcs = lcs.mkString(",")
s"""
class Tuple${n}DataDiff[$allUcs,${ucs.map(uc => s"P$uc").mkString(",")}](implicit
  ${(0 until n).map { i =>
    s"${lcs(i)}Diff: DataDiff[${ucs(i)},P${ucs(i)}]"
  }.mkString(",\n  ")}
) extends DataDiff[($allUcs),(${ucs.map(uc => s"Option[P$uc]").mkString(",")})] {
  type TupleType = ($allUcs)11
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    ${
      (0 until n).map { i =>
        val lc = lcs(i)
        s"val ${lc}Patch = ${lc}Diff.calcDiff(oldValue._${i+1},newValue._${i+1})"
      }.mkString("\n    ")
    }
    if(${lcs.map { lc =>
      s"${lc}Patch.isEmpty"
    }.mkString(" && ")}) {
      None
    } else {
      Some((${lcs.map(lc => s"${lc}Patch").mkString(",")}))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    ${(0 until n).map { i =>
      val lc = lcs(i)
      s"val $lc = patch._${i+1}.fold(value._${i+1})(${lc}Diff.applyPatch(value._${i+1}, _))"
    }.mkString("\n    ")}
    ($allLcs)
  }
}
"""
  }
  
  def genToFile(path: String) : Unit = {
    val contents =
s"""package s_mach.datadiff.impl

/* WARNING: Generated code. To modify see s_mach.datadiff.codegen.TupleDataDiffCodeGen */

import s_mach.datadiff.DataDiff

${(2 to 22).map(i => gen(i)).mkString("\n")}
"""
    
    import java.io._
    val out = new PrintWriter(new BufferedWriter(new FileWriter(path)))
    out.println(contents)
    out.close()
  }

}
