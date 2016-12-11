package s_mach.datadiff

import org.scalatest._

class DataDiff_UnitTest extends FlatSpec with Matchers {
  val unit = ()
  "DataDiff_Unit.noChange" should "be unit" in {
    DataDiff_Unit.noChange shouldBe unit
  }
  "DataDiff_Unit.applyPatch" should "be unit" in {
    DataDiff_Unit.applyPatch((),()) shouldBe unit
  }
  "DataDiff_Unit.calcDiff" should "be unit" in {
    DataDiff_Unit.calcDiff((),()) shouldBe unit
  }
}
