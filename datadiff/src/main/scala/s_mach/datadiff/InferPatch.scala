package s_mach.datadiff

/**
  * A helper type-class for inferring the patch type for a type
  * @tparam A
  */
trait InferPatch[A] extends InferDataDiff[A] {
  def noChange[P](implicit ev:DataDiff[A,P]) : P
}
