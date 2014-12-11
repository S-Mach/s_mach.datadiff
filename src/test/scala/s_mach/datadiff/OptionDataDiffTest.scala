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

import org.scalatest.{Matchers, FlatSpec}
import s_mach.datadiff.OptionPatch.{SetNone, SetValue, ApplyInnerPatch}
import s_mach.datadiff.impl.AppliedInnerPatchToNoneException

import scala.util.{Failure, Try}

class OptionDataDiffTest extends FlatSpec with Matchers {

  "OptionDiff.diff" must "detect differences between the old and new value" in {
    {
      val some1 : Option[Int] = Some(1)
      some1 calcDiff Some(2) should equal(Some(ApplyInnerPatch(2)))
      Option.empty[Int] calcDiff Some(2) should equal(Some(SetValue(2)))

      some1 calcDiff Option.empty[Int] should equal(Some(SetNone))

      some1 calcDiff Some(1) should equal(None)
      Option.empty[Int] calcDiff Option.empty[Int] should equal(None)
    }

    {
      val some1 : Option[TestData] = Some(TestData("1","1"))
      val some2 : Option[TestData] = Some(TestData("1","2"))
      some1 calcDiff some2 should equal(Some(ApplyInnerPatch(TestDataPatch(None,Some("2")))))
      Option.empty[TestData] calcDiff some2 should equal(Some(SetValue(some2.get)))

      some1 calcDiff Option.empty[TestData] should equal(Some(SetNone))

      some1 calcDiff some1 should equal(None)
      Option.empty[TestData] calcDiff Option.empty[TestData] should equal(None)
    }
  }

  "OptionDiff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val some1 : Option[Int] = Some(1)

      {
        val patch = some1 calcDiff Some(2)

        some1 applyPatch patch should equal(Some(2))
        val result = Try(Option.empty[Int] applyPatch patch)
        result shouldBe a [Failure[_]]
        result.failed.get shouldBe a [AppliedInnerPatchToNoneException]
      }
      {
        val patch = Option.empty[Int] calcDiff Some(2)

        some1 applyPatch patch should equal(Some(2))

        Option.empty[Int] applyPatch patch should equal(Some(2))
      }
    }
    {
      val some1 : Option[TestData] = Some(TestData("1","1"))
      val some2 : Option[TestData] = Some(TestData("1","2"))

      {
        val patch = some1 calcDiff some2

        some1 applyPatch patch should equal(some2)

        val result = Try(Option.empty[TestData] applyPatch patch)
        result shouldBe a [Failure[_]]
        result.failed.get shouldBe a [AppliedInnerPatchToNoneException]
      }
      {
        val patch = Option.empty[TestData] calcDiff some2

        some1 applyPatch patch should equal(some2)
        Option.empty[TestData] applyPatch patch should equal(some2)
      }
    }
  }

}
