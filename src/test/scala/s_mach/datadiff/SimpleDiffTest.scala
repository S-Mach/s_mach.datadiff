package s_mach.datadiff

import org.scalatest.{Matchers, FlatSpec}

class SimpleDiffTest extends FlatSpec with Matchers {

  "SimpleDiff.diff" must "detect differences between the old and new value" in {
    1 diff 2 should equal(Some(2))
    1 diff 1 should equal(None)
  }

  "SimpleDiff.patch" must "apply changes to an old value to achieve new value" in {
    val d = 1 diff 2
    1 patch d should equal(2)
  }

  "SimpleDiff.valuetoPatch" must "make a change from a value" in {
    val aDiff = implicitly[Diff[Int,Int]]

    aDiff.valueToPatch(1) should equal(1)
  }

  "SimpleDiff.canPatchToValue" must "always be true" in {
    val aDiff = implicitly[Diff[Int,Int]]

    aDiff.canPatchToValue(1) should equal(true)
  }

  "SimpleDiff.patchToValue" must "make a value from a change" in {
    val aDiff = implicitly[Diff[Int,Int]]

    aDiff.patchToValue(1) should equal(1)
  }
}
