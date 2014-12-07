package s_mach.datadiff

import org.scalatest.{Matchers, FlatSpec}

import scala.util.{Failure, Try}

class OptionDiffTest extends FlatSpec with Matchers {

  case class Test(value: String)
  case class TestDiff(value: Option[String])
  
  implicit object Diff_Test$ extends Diff[Test,TestDiff] {
    override def diff(oldValue: Test, newValue: Test): Option[Patch] = ???

    override def applyPatch(value: Test, patch: Patch): Test = ???

    override def mkPatch(value: Test): Patch = ???

    override def canMkValue(patch: Patch): Boolean = patch.value.nonEmpty

    override def mkValue(patch: Patch): Test = Test(patch.value.getOrElse(throw new PatchNotCompleteException))
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

  "OptionDiff.mkPatch" must "make a change from a value" in {
    val aDiff = implicitly[Diff[Option[Int],Option[Int]]]

    aDiff.mkPatch(Some(1)) should equal(Some(1))
    aDiff.mkPatch(None) should equal(None)
  }

  "OptionDiff.canMkValue" must "always be true" in {
    val aDiff = implicitly[Diff[Option[Test],Option[TestDiff]]]

    aDiff.canMkValue(Some(TestDiff(Some("1")))) should equal(true)
    aDiff.canMkValue(Some(TestDiff(None))) should equal(false)
    aDiff.canMkValue(None) should equal(true)
  }

  "OptionDiff.mkValue" must "make a value from a change" in {
    val aDiff = implicitly[Diff[Option[Test],Option[TestDiff]]]

    aDiff.mkValue(Some(TestDiff(Some("1")))) should equal(Some(Test("1")))

    {
      val result = Try(aDiff.mkValue(Some(TestDiff(None))))
      result shouldBe a [Failure[_]]
      result.failed.get shouldBe a [PatchNotCompleteException]
    }
    aDiff.mkValue(None) should equal(None)
  }
}
