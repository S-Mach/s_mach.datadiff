package s_mach.datadiff

/**
  * A helper type-class for inferring the DataDiff type for a type
  * @tparam A
  */
trait InferDataDiff[A] {
  def infer[P](implicit ev:DataDiff[A,P]) : DataDiff[A,P]
}

