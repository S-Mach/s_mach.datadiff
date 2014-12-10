package s_mach.datadiff

import org.scalatest.{Matchers, FlatSpec}

class TupleDataDiffTest extends FlatSpec with Matchers {

  "TupleDiff.diff" must "detect differences between the old and new value" in {
    (1,1) calcDiff (2,1) should equal(Some((Some(2),None)))
    (1,1) calcDiff (1,1) should equal(None)
  }

  "SimpleDiff.patch" must "apply changes to an old value to achieve new value" in {
    val d = (1,1) calcDiff (2,1)
    (1,1) applyPatch d should equal((2,1))
  }

}
