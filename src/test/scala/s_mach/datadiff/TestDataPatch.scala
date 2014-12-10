package s_mach.datadiff

import scala.util.Random

case class TestData(value1: String, value2: String)
case class TestDataPatch(value1: Option[String], value2: Option[String])

object TestData {
  def random() = TestData(
    value1 = Random.nextString(10),
    value2 = Random.nextString(10)
  )
  implicit object DataDiff_Test extends DataDiff[TestData,TestDataPatch] {
    override def calcDiff(oldValue: TestData, newValue: TestData): Option[Patch] = {
      val value1Diff = oldValue.value1 calcDiff newValue.value1
      val value2Diff = oldValue.value2 calcDiff newValue.value2
      if(value1Diff.isEmpty && value2Diff.isEmpty) {
        None
      } else {
        Some(TestDataPatch(
          value1Diff,
          value2Diff
        ))
      }
    }
  
    override def applyPatch(value: TestData, patch: Patch): TestData = {
      TestData(
        value1 = value.value1 applyPatch patch.value1,
        value2 = value.value1 applyPatch patch.value2
      )
    }
  }
}

