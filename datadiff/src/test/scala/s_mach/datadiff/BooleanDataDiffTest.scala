package s_mach.datadiff


import org.scalatest.{FlatSpec, Matchers}
import s_mach.datadiff.impl.BooleanDataDiffImpl

class BooleanDataDiffTest extends FlatSpec with Matchers {
  val fixture = new BooleanDataDiffImpl
  "BooleanDataDiffImpl.noChange" should "equal false" in {
    fixture.noChange shouldBe false
  }
  "BooleanDataDiffImpl.calcDiff" should "return TRUE if values are different FALSE otherwise" in {
    fixture.calcDiff(true,true) shouldBe false
    fixture.calcDiff(true,false) shouldBe true
    fixture.calcDiff(false,true) shouldBe true
    fixture.calcDiff(false,false) shouldBe false
  }
  "BooleanDataDiffImpl.applyPatch" should "negate the value if patch is TRUE otherwise same value" in {
    fixture.applyPatch(true, true) shouldBe false
    fixture.applyPatch(false, true) shouldBe true
    fixture.applyPatch(true, false) shouldBe true
    fixture.applyPatch(false, false) shouldBe false
  }
}
