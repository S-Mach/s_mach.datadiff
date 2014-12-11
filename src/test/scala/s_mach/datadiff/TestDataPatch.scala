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
package s_mach.datadiff

import scala.util.Random

case class TestData(value1: String, value2: String)
case class TestDataPatch(value1: Option[String], value2: Option[String])

object TestData {
  def random() = TestData(
    value1 = Random.nextString(10),
    value2 = Random.nextString(10)
  )
  implicit object DataDiff_Test extends DataDiff[TestData,TestDataPatch] {
    override def calcDiff(oldValue: TestData, newValue: TestData): Option[Patch] = {
      val value1Diff = oldValue.value1 calcDiff newValue.value1
      val value2Diff = oldValue.value2 calcDiff newValue.value2
      if(value1Diff.isEmpty && value2Diff.isEmpty) {
        None
      } else {
        Some(TestDataPatch(
          value1Diff,
          value2Diff
        ))
      }
    }
  
    override def applyPatch(value: TestData, patch: Patch): TestData = {
      TestData(
        value1 = value.value1 applyPatch patch.value1,
        value2 = value.value1 applyPatch patch.value2
      )
    }
  }
}

