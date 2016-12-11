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
package s_mach.datadiff

import org.scalatest.{Matchers, FlatSpec}
import s_mach.datadiff.impl.SimpleDataDiffImpl

class SimpleDataDiffTest extends FlatSpec with Matchers {

  val d = new SimpleDataDiffImpl[Int]
  "SimpleDiffImpl.diff" must "detect differences between the old and new value" in {
    d.calcDiff(1,2) should equal(Some(2))
    d.calcDiff(1,1) should equal(None)
  }

  "SimpleDiff.patch" must "apply changes to an old value to achieve new value" in {
    val d1 = d.calcDiff(1,2)
    d.applyPatch(1,d1) should equal(2)
    val d2 = d.calcDiff(1,1)
    d.applyPatch(2,d2) should equal(2)
  }

}
