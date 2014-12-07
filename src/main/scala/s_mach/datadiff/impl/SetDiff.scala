package s_mach.datadiff.impl

import s_mach.datadiff.Diff

import scala.collection.generic.CanBuildFrom

case class SetPatch[A](add: Set[A], remove: Set[A])

class SetDiff[A,P](implicit
  aDiff: Diff[A,P],
  cbf: CanBuildFrom[Nothing, A, Set[A]]
) extends Diff[Set[A],SetPatch[A]] {
  override def diff(oldValue: Set[A], newValue: Set[A]): Option[Patch] = {
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

  override def valueToPatch(value: Set[A]): Patch = SetPatch(value, Set.empty)

  override def canPatchToValue(patch: Patch): Boolean = true

  override def patchToValue(patch: Patch): Set[A] = patch.add -- patch.remove
}
