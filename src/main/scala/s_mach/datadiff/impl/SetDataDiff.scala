package s_mach.datadiff.impl

import s_mach.datadiff.{SetPatch, DataDiff}

import scala.collection.generic.CanBuildFrom

class SetDataDiff[A](implicit
  cbf: CanBuildFrom[Nothing, A, Set[A]]
) extends DataDiff[Set[A],SetPatch[A]] {
  override def calcDiff(oldValue: Set[A], newValue: Set[A]): Option[Patch] = {
    val remove = oldValue -- newValue
    if(remove.isEmpty && oldValue.size == newValue.size) {
      None
    } else {
      val add = newValue -- oldValue
      Some(SetPatch(add, remove))
    }
  }

  override def applyPatch(value: Set[A], patch: Patch): Set[A] = {
    val builder = cbf()
    value.iterator.filterNot(patch.remove.contains).foreach(builder.+=)
    builder ++= patch.add
    builder.result()
  }

}
