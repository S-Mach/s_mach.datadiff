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

class SetDataDiffTest extends FlatSpec with Matchers {

  val set1 = Set(1,2,3)
  val set2 = Set(2,3,4)

  "SetDiff.diff" must "detect differences between the old and new value" in {
    set1 -->? set2 should equal(Some(SetPatch(Set(4),Set(1))))
    set1 -->? set1 should equal(None)
  }

  "SetDiff.patch" must "apply changes to an old value to achieve new value" in {
    val d = set1 -->? set2
    set1 |<-- d should equal(set2)
  }

}
