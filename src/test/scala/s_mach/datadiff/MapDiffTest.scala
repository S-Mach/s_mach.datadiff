package s_mach.datadiff

import org.scalatest.{Matchers, FlatSpec}
import s_mach.datadiff.impl.MapPatch
import scala.util.{Failure, Try}

class MapDiffTest extends FlatSpec with Matchers {

  val map1 = Map(1 -> "a",2 -> "b",3 -> "c")
  val map2 = Map(2 -> "d",3 -> "c", 4 -> "e")
  val aDiff = implicitly[Diff[Map[Int,String],MapPatch[Int,String,String]]]

  "MapDiff.diff" must "detect differences between the old and new value" in {
    map1 -->? map2 should equal(Some(MapPatch(
      add = Map(4 -> "e"),
      remove = Set(1),
      change = Map(2 -> "d")
    )))
    map1 -->? map1 should equal(None)
  }

  "MapDiff.patch" must "apply changes to an old value to achieve new value" in {
    val d = map1 -->? map2
    map1 |<-- d should equal(map2)
  }

  "MapDiff.valuetoPatch" must "make a change from a value" in {

    aDiff.valueToPatch(map1) should equal(MapPatch(map1,Set.empty,Map.empty))
  }

  "MapDiff.canPatchToValue" must "always be true" in {
    aDiff.canPatchToValue(MapPatch(map1, Set.empty,Map.empty)) should equal(true)
    aDiff.canPatchToValue(MapPatch(map1, Set(1),Map.empty)) should equal(false)
    aDiff.canPatchToValue(MapPatch(map1, Set.empty,Map(2 -> "d"))) should equal(false)
  }

  "MapDiff.patchToValue" must "make a value from a change" in {
    aDiff.patchToValue(MapPatch(map1,Set.empty, Map.empty)) should equal(map1)

    {
      val result = Try(aDiff.patchToValue(MapPatch(map1, Set(1), Map.empty)))
      result shouldBe a [Failure[_]]
      result.failed.get shouldBe a [PatchNotCompleteException]
    }

    {
      val result = Try(aDiff.patchToValue(MapPatch(map1, Set.empty, Map(2 -> "d"))))
      result shouldBe a [Failure[_]]
      result.failed.get shouldBe a [PatchNotCompleteException]
    }
  }
}
