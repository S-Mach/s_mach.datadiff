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
