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
package s_mach.datadiff.codegen

object AllTupleDataDiffImplicitsCodeGen {
  def gen(n: Int) = {
    val lcs = ('a' to 'z').map(_.toString).take(n)
    val ucs = ('A' to 'Z').map(_.toString).take(n)
    val allUcs = ucs.mkString(",")
//    val allLcs = lcs.mkString(",")
//    val allPatchUcs = ucs.map(uc => s"P$uc").mkString(",")
    val aType = s"($allUcs)"
    val pType = s"(${ucs.map(uc => s"Option[P$uc]").mkString(",")})"
    val typeParms =
      (
        ucs ++
        ucs.map(uc => s"P$uc")
      ).mkString(",")
s"""
  implicit def mkDataDiff_Tuple${n}[$typeParms](implicit
    ${(0 until n).map { i =>
      s"${lcs(i)}Diff: DataDiff[${ucs(i)},P${ucs(i)}]"
    }.mkString(",\n    ")}
  ) : DataDiff[$aType,$pType] =
    DataDiff.forProductType[$aType,$pType]
"""
  }
  
  def genToFile(path: String) : Unit = {

    val contents =
s"""$header
package s_mach.datadiff

/* WARNING: Generated code. To modify see s_mach.datadiff.AllTupleDataDiffImplicits */

trait AllTupleDataDiffImplicits {
${(2 to 22).map(i => gen(i)).mkString("\n")}
}
"""
    
    import java.io._
    val out = new PrintWriter(new BufferedWriter(new FileWriter(path)))
    out.println(contents)
    out.close()
  }

}
