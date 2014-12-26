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

/* WARNING: Generated code. To modify see s_mach.datadiff.TupleDataDiffTestCodeGen */

import scala.util.Random
import org.scalatest.{Matchers, FlatSpec}

class TupleDataDiffTest extends FlatSpec with Matchers {

  "Tuple2Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2))))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple2Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple3Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple3Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple4Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple4Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple5Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple5Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple6Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple6Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple7Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple7Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple8Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple8Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple9Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple9Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple10Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple10Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1,_10 = tuple._10 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple11Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple11Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1,_10 = tuple._10 + 1,_11 = tuple._11 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple12Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple12Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1,_10 = tuple._10 + 1,_11 = tuple._11 + 1,_12 = tuple._12 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple13Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple13Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1,_10 = tuple._10 + 1,_11 = tuple._11 + 1,_12 = tuple._12 + 1,_13 = tuple._13 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple14Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple14Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1,_10 = tuple._10 + 1,_11 = tuple._11 + 1,_12 = tuple._12 + 1,_13 = tuple._13 + 1,_14 = tuple._14 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple15Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple15Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1,_10 = tuple._10 + 1,_11 = tuple._11 + 1,_12 = tuple._12 + 1,_13 = tuple._13 + 1,_14 = tuple._14 + 1,_15 = tuple._15 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple16Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple16Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1,_10 = tuple._10 + 1,_11 = tuple._11 + 1,_12 = tuple._12 + 1,_13 = tuple._13 + 1,_14 = tuple._14 + 1,_15 = tuple._15 + 1,_16 = tuple._16 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple17Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple17Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1,_10 = tuple._10 + 1,_11 = tuple._11 + 1,_12 = tuple._12 + 1,_13 = tuple._13 + 1,_14 = tuple._14 + 1,_15 = tuple._15 + 1,_16 = tuple._16 + 1,_17 = tuple._17 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple18Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple18Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1,_10 = tuple._10 + 1,_11 = tuple._11 + 1,_12 = tuple._12 + 1,_13 = tuple._13 + 1,_14 = tuple._14 + 1,_15 = tuple._15 + 1,_16 = tuple._16 + 1,_17 = tuple._17 + 1,_18 = tuple._18 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple19Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple19Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1,_10 = tuple._10 + 1,_11 = tuple._11 + 1,_12 = tuple._12 + 1,_13 = tuple._13 + 1,_14 = tuple._14 + 1,_15 = tuple._15 + 1,_16 = tuple._16 + 1,_17 = tuple._17 + 1,_18 = tuple._18 + 1,_19 = tuple._19 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple20Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple20Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1,_10 = tuple._10 + 1,_11 = tuple._11 + 1,_12 = tuple._12 + 1,_13 = tuple._13 + 1,_14 = tuple._14 + 1,_15 = tuple._15 + 1,_16 = tuple._16 + 1,_17 = tuple._17 + 1,_18 = tuple._18 + 1,_19 = tuple._19 + 1,_20 = tuple._20 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple21Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple21Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1,_10 = tuple._10 + 1,_11 = tuple._11 + 1,_12 = tuple._12 + 1,_13 = tuple._13 + 1,_14 = tuple._14 + 1,_15 = tuple._15 + 1,_16 = tuple._16 + 1,_17 = tuple._17 + 1,_18 = tuple._18 + 1,_19 = tuple._19 + 1,_20 = tuple._20 + 1,_21 = tuple._21 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }


  "Tuple22Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Tuple22Diff.patch" must "apply changes to an old value to achieve new value" in {
    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_1 = Random.nextInt())
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }

    {
      val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
      val modTuple = tuple.copy(_2 = tuple._2 + 1,_3 = tuple._3 + 1,_4 = tuple._4 + 1,_5 = tuple._5 + 1,_6 = tuple._6 + 1,_7 = tuple._7 + 1,_8 = tuple._8 + 1,_9 = tuple._9 + 1,_10 = tuple._10 + 1,_11 = tuple._11 + 1,_12 = tuple._12 + 1,_13 = tuple._13 + 1,_14 = tuple._14 + 1,_15 = tuple._15 + 1,_16 = tuple._16 + 1,_17 = tuple._17 + 1,_18 = tuple._18 + 1,_19 = tuple._19 + 1,_20 = tuple._20 + 1,_21 = tuple._21 + 1,_22 = tuple._22 + 1)
      val d = tuple calcDiff modTuple
      tuple applyPatch d should equal(modTuple)
    }
  }

}

