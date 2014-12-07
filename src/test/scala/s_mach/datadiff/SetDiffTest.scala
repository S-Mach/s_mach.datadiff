package s_mach.datadiff

import org.scalatest.{Matchers, FlatSpec}
import s_mach.datadiff.impl.SetPatch

class SetDiffTest extends FlatSpec with Matchers {

  val set1 = Set(1,2,3)
  val set2 = Set(2,3,4)
  val aDiff = implicitly[Diff[Set[Int],SetPatch[Int]]]

  "SetDiff.diff" must "detect differences between the old and new value" in {
    set1 -->? set2 should equal(Some(SetPatch(Set(4),Set(1))))
    set1 -->? set1 should equal(None)
  }

  "SetDiff.patch" must "apply changes to an old value to achieve new value" in {
    val d = set1 -->? set2
    set1 |<-- d should equal(set2)
  }

  "SetDiff.valuetoPatch" must "make a change from a value" in {

    aDiff.valueToPatch(set1) should equal(SetPatch(set1,Set.empty))
  }

  "SetDiff.canPatchToValue" must "always be true" in {
    aDiff.canPatchToValue(SetPatch(Set.empty,Set.empty)) should equal(true)
  }

  "SetDiff.patchToValue" must "make a value from a change" in {
    aDiff.patchToValue(SetPatch(set1,Set(3))) should equal(Set(1,2))
  }
}