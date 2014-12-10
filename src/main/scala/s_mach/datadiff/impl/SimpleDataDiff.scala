package s_mach.datadiff.impl

import s_mach.datadiff.DataDiff

class SimpleDataDiff[A] extends DataDiff[A,A] {

  override def calcDiff(oldValue: A, newValue: A) = {
    if(oldValue != newValue) {
      Some(newValue)
    } else {
      None
    }
  }

  override def applyPatch(value: A, change: A): A = change

}