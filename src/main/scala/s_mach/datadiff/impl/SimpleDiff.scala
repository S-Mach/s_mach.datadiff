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

  override def mkPatch(value: A): A = value

  override def canMkValue(patch: A): Boolean = true

  override def mkValue(patch: A): A = patch
}