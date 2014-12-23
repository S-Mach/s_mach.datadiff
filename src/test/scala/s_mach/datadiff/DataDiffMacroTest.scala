package s_mach.datadiff

import org.scalatest.{FlatSpec, Matchers}
import testdata._

class DataDiffMacroTest extends FlatSpec with Matchers {
  "mkDataDiff" must "generate a DataDiff instance given a case class and its patch case class" in {
    val d1 = TestData("1",2)
    val d2 = TestData("1",3)
    val d3 = TestData("2",3)

    val patch1 = d1 calcDiff d2
    patch1 should equal(Some(TestDataPatch(None,Some(3))))
    d1 applyPatch patch1 should equal(d2)

    val patch2 = d1 calcDiff d3
    patch2 should equal(Some(TestDataPatch(Some("2"),Some(3))))
    d1 applyPatch patch2 should equal(d3)

    val patch3 = d1 calcDiff d1
    patch3 should equal(None)
    d1 applyPatch patch3 should equal(d1)
  }

  "mkDataDiff" must "generate a DataDiff instance given a tuple type" in {
    implicit def mkTuple2Diff[A,B,PA,PB](implicit
      aDiff: DataDiff[A,PA],
      bDiff: DataDiff[B,PB]
    ) = mkDataDiff[(A,B),(Option[PA],Option[PB])]

    val d1 = ("1",2)
    val d2 = ("1",3)
    val d3 = ("2",3)

    val patch1 = d1 calcDiff d2
    patch1 should equal(Some((None,Some(3))))
    d1 applyPatch patch1 should equal(d2)

    val patch2 = d1 calcDiff d3
    patch2 should equal(Some((Some("2"),Some(3))))
    d1 applyPatch patch2 should equal(d3)

    val patch3 = d1 calcDiff d1
    patch3 should equal(None)
    d1 applyPatch patch3 should equal(d1)
  }
}

