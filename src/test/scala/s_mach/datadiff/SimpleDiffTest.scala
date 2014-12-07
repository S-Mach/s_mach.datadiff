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

  "SimpleDiff.mkPatch" must "make a change from a value" in {
    val aDiff = implicitly[Diff[Int,Int]]

    aDiff.mkPatch(1) should equal(1)
  }

  "SimpleDiff.canMkValue" must "always be true" in {
    val aDiff = implicitly[Diff[Int,Int]]

    aDiff.canMkValue(1) should equal(true)
  }

  "SimpleDiff.mkValue" must "make a value from a change" in {
    val aDiff = implicitly[Diff[Int,Int]]

    aDiff.mkValue(1) should equal(1)
  }
}
