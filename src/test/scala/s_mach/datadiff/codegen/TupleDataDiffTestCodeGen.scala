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

object TupleDataDiffTestCodeGen {
  def gen(n: Int) = {
    val lcs = ('a' to 'z').map(_.toString).take(n)
    val ucs = ('A' to 'Z').map(_.toString).take(n)
    val allUcs = ucs.mkString(",")
    val allLcs = lcs.mkString(",")
    val indices = 0 until n
    s"""
  "Tuple${n}Diff.diff" must "detect differences between the old and new value" in {
    val noChange = patchFor[Int].noChange
    val tuple = (${indices.map(i => "Random.nextInt()").mkString(",")})
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal((noChange,modTuple._2 - tuple._2${if(n > 2 ) "," + (2 until n).map(i => "noChange").mkString(",") else ""}))
    tuple calcDiff tuple should equal(patchFor[(${indices.map(_ => s"Int").mkString(",")})].noChange)
  }

  "Tuple${n}Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (${indices.map(i => "Random.nextInt()").mkString(",")})
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (${indices.map(i => "Random.nextInt()").mkString(",")})
      val modTuple = tuple.copy(${(2 to n).map(i => s"_$i = tuple._$i + 1").mkString(",")})
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }
"""
  }
  
  def genToFile(path: String) : Unit = {
    val contents =
s"""$header
package s_mach.datadiff

/* WARNING: Generated code. To modify see s_mach.datadiff.TupleDataDiffTestCodeGen */

import scala.util.Random
import org.scalatest.{Matchers, FlatSpec}

class TupleDataDiffTest extends FlatSpec with Matchers {
${(2 to 22).map(i => gen(i)).mkString("\n")}
}
"""
    
    import java.io._
    val out = new PrintWriter(new BufferedWriter(new FileWriter(path)))
    out.println(contents)
    out.close()
  }

}
