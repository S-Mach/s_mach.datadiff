package s_mach.datadiff.impl

trait AllBuiltInDataDiffImplicits {
  implicit object DataDiff_Byte extends SimpleDataDiff[Byte]
  implicit object DataDiff_Short extends SimpleDataDiff[Short]
  implicit object DataDiff_Int extends SimpleDataDiff[Int]
  implicit object DataDiff_Long extends SimpleDataDiff[Long]
  implicit object DataDiff_Float extends SimpleDataDiff[Float]
  implicit object DataDiff_Double extends SimpleDataDiff[Double]
  implicit object DataDiff_BigInt extends SimpleDataDiff[BigInt]
  implicit object DataDiff_BigDecimal extends SimpleDataDiff[BigDecimal]
  implicit object DataDiff_String extends SimpleDataDiff[String]
}
