/*
                    ,i::,
               :;;;;;;;
              ;:,,::;.
            1ft1;::;1tL
              t1;::;1,
               :;::;               _____       __  ___              __
          fCLff ;:: tfLLC         / ___/      /  |/  /____ _ _____ / /_
         CLft11 :,, i1tffLi       \__ \ ____ / /|_/ // __ `// ___// __ \
         1t1i   .;;   .1tf       ___/ //___// /  / // /_/ // /__ / / / /
       CLt1i    :,:    .1tfL.   /____/     /_/  /_/ \__,_/ \___//_/ /_/
       Lft1,:;:       , 1tfL:
       ;it1i ,,,:::;;;::1tti      s_mach.datadiff
         .t1i .,::;;; ;1tt        Copyright (c) 2014 S-Mach, Inc.
         Lft11ii;::;ii1tfL:       Author: lance.gatlin@gmail.com
          .L1 1tt1ttt,,Li
            ...1LLLL...
*/
package s_mach.datadiff.testdata

import s_mach.datadiff._

case class TestDataPatch(value1: StringPatch, value2: IntPatch)
object TestDataPatch {
  val noChange = TestDataPatch(patchFor[String].noChange, patchFor[Int].noChange)
}
case class TestData(value1: String, value2: Int)
object TestData {
  implicit val dataDiff_TestData = DataDiff.forProductType[TestData,TestDataPatch]
}

// TODO: tests for all these below
case class TestData2Patch(
  value1: IntPatch,
  value2: StringPatch,
  value3: OptionPatch[Double,DoublePatch],
  value4: TestDataPatch
)
case class TestData2(
  value1: Int,
  value2: String,
  value3: Option[Double],
  value4: TestData
)
object TestData2 {
  implicit val dataDiff_TestData2 = DataDiff.forProductType[TestData2,TestData2Patch]
}

case class TestData3Patch(value1: (IntPatch,StringPatch,DoublePatch))
case class TestData3(value1: (Int,String,Double))
object TestData3 {
  implicit val dataDiff_TestData3 = DataDiff.forProductType[TestData3,TestData3Patch]
}

case class TestData4Patch(
  value1: IntPatch,
  value2: TestData2Patch,
  value3: SeqPatch[Double],
  value4: TestData3Patch
)
case class TestData4(
  value1: Int,
  value2: TestData2,
  value3: List[Double],
  value4: TestData3
)
object TestData4 {
  implicit val dataDiff_TestData4 = DataDiff.forProductType[TestData4,TestData4Patch]
}


case class TestEnumPatch(value1: Option[String])
sealed trait TestEnum extends Product
case object TestEnum1 extends TestEnum
case object TestEnum2 extends TestEnum
case object TestEnum3 extends TestEnum
object TestEnum {
  val values = List(TestEnum1,TestEnum2,TestEnum3)
  def apply(value1: String) : TestEnum = values.find(_.toString == value1).get
  def unapply(e:TestEnum) : Option[String] = Some(e.toString)
  implicit val dataDiff_TestEnum = DataDiff.forProductType[TestEnum,TestEnumPatch]
}


case class TestADTPatch(
  _type: StringPatch,
  value1: OptionPatch[String, StringPatch],
  value2: OptionPatch[Double, DoublePatch]
)
sealed trait TestADT extends Product
case class TestADT_1(value1: String) extends TestADT
case class TestADT_2(value2: Double) extends TestADT
object TestADT {
  def apply(_type: String, value1: Option[String], value2: Option[Double]) : TestADT = {
    _type match {
      case "TestADT_1" => TestADT_1(value1.get)
      case "TestADT_2" => TestADT_2(value2.get)
    }
  }
  def unapply(tb:TestADT) : Option[(String,Option[String],Option[Double])] = {
    tb match {
      case TestADT_1(value1) => Some(("TestADT_1",Some(value1),None))
      case TestADT_2(value2) => Some(("TestADT_2",None,Some(value2)))
    }
  }
  implicit val dataDiff_TestADT = DataDiff.forProductType[TestADT,TestADTPatch]
}

case class TestData5Patch(value1: TestADTPatch, value2: TestEnumPatch)
case class TestData5(value1: TestADT, value2: TestEnum)

object TestData5 {
  implicit val dataDiff_TestData5 =
    DataDiff.forProductType[TestData5,TestData5Patch]
}

//case class TestData6Patch[A <: TestADT](value1: )
//case class TestData6[A <: TestADT](value1: A)
//
//object TestData6 {
//  implicit def mkDataData_TestData6[A <: TestADT,P,PA](implicit
//    aDataDiff:DataDiff[A,PA]
//  ) : DataDiff[TestData6[A],P] =
//      DataDiff.forProductType[TestData6[A],P]
//}