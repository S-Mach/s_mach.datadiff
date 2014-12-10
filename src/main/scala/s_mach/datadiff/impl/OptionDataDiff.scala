package s_mach.datadiff.impl

import s_mach.datadiff.{OptionPatch, DataDiff}

class AppliedInnerPatchToNoneException extends RuntimeException

class OptionDataDiff[A,P](implicit
  aDiff: DataDiff[A,P]
) extends DataDiff[Option[A],OptionPatch[A,P]] {
  // Note: some impls may build diff at same time equality is tested
  override def calcDiff(optOldValue: Option[A], optNewValue: Option[A]): Option[OptionPatch[A,P]] = {
    optOldValue match {
      // Old was set
      case Some(oldValue) =>
        optNewValue match {
          case Some(newValue) =>
            // Using map/Some.apply here so that if there is no diff between
            // old and new then result is None
            aDiff.calcDiff(oldValue,newValue).map { patch =>
              OptionPatch.ApplyInnerPatch(patch)
            }
          case None => Some(OptionPatch.SetNone)
        }
        
      // Old value was unset
      case None =>
        optNewValue match {
          // If new value is set, need to convert it to a patch since no old value to diff against
          case Some(newValue) => Some(OptionPatch.SetValue(newValue))
          case None => None
        }
    }
  }

  override def applyPatch(optValue: Option[A], patch: OptionPatch[A,P]): Option[A] = {
    patch match {
      // Patch value to Some(A), extract inner patch for A
      case OptionPatch.ApplyInnerPatch(aPatch) =>
        optValue match {
          case Some(value) =>
            Some(aDiff.applyPatch(value, aPatch))
          // Value has no real value to patch against
          case None =>
            throw new AppliedInnerPatchToNoneException
        }
      case OptionPatch.SetValue(aValue) => Some(aValue)
      // Patch value to None
      case OptionPatch.SetNone => None
    }
  }

}
