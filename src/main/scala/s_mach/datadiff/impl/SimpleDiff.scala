package s_mach.datadiff.impl

import s_mach.datadiff.Diff

class SimpleDiff[A] extends Diff[A,A] {

  override def diff(oldValue: A, newValue: A) = {
    if(oldValue != newValue) {
      Some(newValue)
    } else {
      None
    }
  }

  override def applyPatch(value: A, change: A): A = change

  override def valueToPatch(value: A): A = value

  override def canPatchToValue(patch: A): Boolean = true

  override def patchToValue(patch: A): A = patch
}