package s_mach.datadiff.impl

import s_mach.datadiff.{PatchIncompleteValueException, Diff}

case class MapPatch[A,B,P](
  add: Map[A,B],
  remove: Set[A],
  change: Map[A,P]
)

class MapDiff[A,B,P](implicit
  bDiff: Diff[B,P]
) extends Diff[Map[A,B],MapPatch[A,B,P]] {
  override def diff(oldValue: Map[A,B], newValue: Map[A,B]): Option[Patch] = {
    val removeBuilder = Set.newBuilder[A]
    val changeBuilder = Map.newBuilder[A,P]
    oldValue.foreach { case (a,oldB) =>
      newValue.get(a) match {
        case Some(newB) =>
          bDiff.diff(oldB, newB) match {
            case Some(patch) =>
              changeBuilder += ((a, patch))
            case None =>
          }
        case None =>
          removeBuilder += a
      }
    }
    val addBuilder = Map.newBuilder[A,B]
    newValue.iterator
      .filterNot { case (a,_) => oldValue.contains(a) }
      .foreach(addBuilder.+=)

    val add = addBuilder.result()
    val remove = removeBuilder.result()
    val change = changeBuilder.result()
    if(add.isEmpty && remove.isEmpty && change.isEmpty) {
      None
    } else {
      Some(MapPatch(add, remove, change))
    }
  }

  override def applyPatch(value: Map[A,B], patch: Patch): Map[A,B] = {
    val builder = Map.newBuilder[A,B]
    builder ++= value.iterator
      .collect { case t@(a,b) if patch.remove.contains(a) == false =>
        patch.change.get(a) match {
          case Some(bPatch) =>
            (a, bDiff.applyPatch(b, bPatch))
          case None => t
        }
      }
    builder ++= patch.add
    builder.result()
  }

  override def valueToPatch(value: Map[A,B]): Patch = MapPatch(value,Set.empty,Map.empty)

  override def canPatchToValue(patch: Patch): Boolean = {
    patch.change.isEmpty && patch.remove.isEmpty
  }

  override def patchToValue(patch: Patch): Map[A,B] = {
    if(canPatchToValue(patch) == false) {
      throw new PatchIncompleteValueException
    }
    patch.add
  }
}