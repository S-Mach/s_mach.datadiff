package s_mach.datadiff

import org.scalatest.{FlatSpec, Matchers}
import s_mach.datadiff.impl.NumericDataDiffImpl

class NumericDataDiffTest extends FlatSpec with Matchers {
  val fixture = new NumericDataDiffImpl[Int]
  "NumericDataDiffImpl.noChange" should "equal Numeric[A].zero" in {
    fixture.noChange shouldBe 0
  }
  "NumericDataDiffImpl.calcDiff" should "compute the difference between two values" in {
    fixture.calcDiff(1111,2223) shouldBe 1112
  }
  "NumericDataDiffImpl.applyPatch" should "add difference to original value" in {
    fixture.applyPatch(1111, 1112) shouldBe 2223
  }
}
