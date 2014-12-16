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

  "Simple2Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple3Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple3Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple4Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple4Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple5Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple5Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple6Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple6Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple7Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple7Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple8Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple8Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple9Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple9Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple10Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple10Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple11Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple11Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple12Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple12Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple13Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple13Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple14Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple14Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple15Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple15Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple16Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple16Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple17Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple17Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple18Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple18Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple19Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple19Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple20Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple20Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple21Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple21Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }


  "Tuple22Diff.diff" must "detect differences between the old and new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    tuple calcDiff modTuple should equal(Some((None,Some(modTuple._2),None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None,None)))
    tuple calcDiff tuple should equal(None)
  }

  "Simple22Diff.patch" must "apply changes to an old value to achieve new value" in {
    val tuple = (Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt(),Random.nextInt())
    val modTuple = tuple.copy(_2 = Random.nextInt())
    val d = tuple calcDiff modTuple
    tuple applyPatch d should equal(modTuple)
  }

}

