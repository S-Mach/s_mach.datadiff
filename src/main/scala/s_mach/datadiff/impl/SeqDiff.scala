package s_mach.datadiff.impl

import scala.collection.generic.CanBuildFrom
import scala.language.higherKinds
import scala.collection.JavaConverters._
import difflib.{InsertDelta, Delta, DiffUtils, Patch}
import s_mach.datadiff.{PatchNotCompleteException, Diff}

case class SeqPatch[A](oomDelta: Vector[Delta[A]])

class SeqDiff[A,M[AA] <: Seq[AA]](implicit
  cbf:CanBuildFrom[Nothing, A, M[A]]
) extends Diff[M[A],SeqPatch[A]] {

  override def diff(oldValue: M[A], newValue: M[A]): Option[Patch] = {
    val jPatch = DiffUtils.diff(oldValue.asJava, newValue.asJava)
    if(jPatch.getDeltas.isEmpty) {
      None
    } else {
      Some(SeqPatch(jPatch.getDeltas.asScala.toVector))
    }
  }

  override def applyPatch(value: M[A], patch: Patch): M[A] = {
    val builder = cbf()
    val jPatch = new difflib.Patch[A]
    patch.oomDelta.foreach(jPatch.addDelta)
    jPatch.applyTo(value.asJava).iterator.asScala.foreach(builder.+=)
    builder.result()
  }

  override def valueToPatch(value: M[A]): Patch = {
    val jPatch = DiffUtils.diff(Seq.empty.asJava, value.asJava)
    SeqPatch(jPatch.getDeltas.asScala.toVector)
  }

  override def canPatchToValue(patch: Patch): Boolean = {
    patch.oomDelta.size == 1 &&
    patch.oomDelta.head.isInstanceOf[InsertDelta[A]]
  }

  override def patchToValue(patch: Patch): M[A] = {
    val builder = cbf()
    if(canPatchToValue(patch) == false) {
      throw new PatchNotCompleteException
    }

    patch.oomDelta
      .head
      .asInstanceOf[InsertDelta[A]]
      .getRevised
      .getLines
      .asScala
      .iterator
      .foreach(builder.+=)

    builder.result()
  }
}
