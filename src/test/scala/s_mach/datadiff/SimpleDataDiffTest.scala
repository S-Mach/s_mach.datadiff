package s_mach.datadiff

import org.scalatest.{Matchers, FlatSpec}

class SimpleDataDiffTest extends FlatSpec with Matchers {

  "SimpleDiff.diff" must "detect differences between the old and new value" in {
    1 calcDiff 2 should equal(Some(2))
    1 calcDiff 1 should equal(None)
  }

  "SimpleDiff.patch" must "apply changes to an old value to achieve new value" in {
    val d = 1 calcDiff 2
    1 applyPatch d should equal(2)
  }

}
