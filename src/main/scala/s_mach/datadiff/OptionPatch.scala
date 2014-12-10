package s_mach.datadiff

sealed trait OptionPatch[+A,+P]
object OptionPatch {
  case object SetNone extends OptionPatch[Nothing,Nothing]
  case class SetValue[A](value: A) extends OptionPatch[A,Nothing]
  case class ApplyInnerPatch[P](patch: P) extends OptionPatch[Nothing,P]
}