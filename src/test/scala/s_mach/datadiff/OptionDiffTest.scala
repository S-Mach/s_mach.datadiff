package s_mach.datadiff

import org.scalatest.{Matchers, FlatSpec}

import scala.util.{Failure, Try}

class OptionDiffTest extends FlatSpec with Matchers {

  case class Test(value: String)
  case class TestDiff(value: Option[String])
  
  implicit object Diff_Test$ extends Diff[Test,TestDiff] {
    override def diff(oldValue: Test, newValue: Test): Option[Patch] = ???

    override def applyPatch(value: Test, patch: Patch): Test = ???

    override def valueToPatch(value: Test): Patch = ???

    override def canPatchToValue(patch: Patch): Boolean = patch.value.nonEmpty

    override def patchToValue(patch: Patch): Test = Test(patch.value.getOrElse(throw new PatchNotCompleteException))
  }

  "OptionDiff.diff" must "detect differences between the old and new value" in {
    val some1 : Option[Int] = Some(1)
    some1 diff Some(2) should equal(Some(Some(2)))
    Option.empty[Int] diff Some(2) should equal(Some(Some(2)))

    some1 diff Option.empty[Int] should equal(Some(None))

    some1 diff Some(1) should equal(None)
    Option.empty[Int] diff Option.empty[Int] should equal(None)
  }

  "OptionDiff.patch" must "apply changes to an old value to achieve new value" in {
    val some1 : Option[Int] = Some(1)

    {
      val d = some1 diff Some(2)

      some1 patch d should equal(Some(2))
      Option.empty[Int] patch d should equal(Some(2))
    }
    {
      val d = Option.empty[Int] diff Some(2)

      some1 patch d should equal(Some(2))
      Option.empty[Int] patch d should equal(Some(2))
    }
  }

  "OptionDiff.valuetoPatch" must "make a change from a value" in {
    val aDiff = implicitly[Diff[Option[Int],Option[Int]]]

    aDiff.valueToPatch(Some(1)) should equal(Some(1))
    aDiff.valueToPatch(None) should equal(None)
  }

  "OptionDiff.canPatchToValue" must "always be true" in {
    val aDiff = implicitly[Diff[Option[Test],Option[TestDiff]]]

    aDiff.canPatchToValue(Some(TestDiff(Some("1")))) should equal(true)
    aDiff.canPatchToValue(Some(TestDiff(None))) should equal(false)
    aDiff.canPatchToValue(None) should equal(true)
  }

  "OptionDiff.patchToValue" must "make a value from a change" in {
    val aDiff = implicitly[Diff[Option[Test],Option[TestDiff]]]

    aDiff.patchToValue(Some(TestDiff(Some("1")))) should equal(Some(Test("1")))

    {
      val result = Try(aDiff.patchToValue(Some(TestDiff(None))))
      result shouldBe a [Failure[_]]
      result.failed.get shouldBe a [PatchNotCompleteException]
    }
    aDiff.patchToValue(None) should equal(None)
  }
}
