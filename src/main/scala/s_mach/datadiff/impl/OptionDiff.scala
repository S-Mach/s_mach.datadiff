package s_mach.datadiff.impl

import s_mach.datadiff.Diff

class OptionDiff[A,P](implicit
  aDiff: Diff[A,P]
) extends Diff[Option[A],Option[P]] {
  // Note: some impls may build diff at same time equality is tested
  override def diff(optOldValue: Option[A], optNewValue: Option[A]): Option[Patch] = {
    optOldValue match {
      // Old was set
      case Some(oldValue) =>
        optNewValue match {
          case Some(newValue) =>
            // Using map/Some.apply here so that if there is no diff between
            // old and new then result is None
            aDiff.diff(oldValue,newValue).map(Some.apply)
          case None => Some(None)
        }
        
      // Old value was unset
      case None =>
        optNewValue match {
          // If new value is set, need to convert it to a patch since no old value to diff against
          case Some(newValue) => Some(Some(aDiff.valueToPatch(newValue)))
          case None => None
        }
    }
  }

  override def applyPatch(optValue: Option[A], patch: Patch): Option[A] = {
    patch match {
      // Patch value to Some(A), extract inner patch for A
      case Some(aPatch) =>
        optValue match {
          case Some(value) =>
            Some(aDiff.applyPatch(value, aPatch))
          // Value has no real value to patch against
          // Attempt to convert inner A patch to a value
          // This can fail with an exception
          case None =>
            Some(aDiff.patchToValue(aPatch))
        }
      // Patch value to None
      case None => None
    }
  }


  override def valueToPatch(value: Option[A]): Patch = value.map(aDiff.valueToPatch)

  override def canPatchToValue(patch: Patch) : Boolean = patch match {
    case None => true
    case Some(aPatch) => aDiff.canPatchToValue(aPatch)
  }

  override def patchToValue(patch: Patch): Option[A] = {
    patch match {
      case Some(aPatch) => Some(aDiff.patchToValue(aPatch))
      case None => None
    }
  }
}
