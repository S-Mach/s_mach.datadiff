package s_mach.datadiff.impl

import scala.language.higherKinds
import scala.collection.generic.CanBuildFrom
import scala.collection.JavaConverters._
import difflib._
import s_mach.datadiff._

class SeqDataDiffImpl[A,M[AA] <: Seq[AA]](implicit
  cbf:CanBuildFrom[Nothing, A, M[A]]
) extends DataDiff[M[A],SeqPatch[A]] {
  
  def chunkToSeqChunk(chunk: Chunk[A]) : SeqChunk[A] = {
    SeqChunk(chunk.getPosition, chunk.getLines.asScala.toVector)
  }

  def deltaToSeqDelta(delta: Delta[A]) : SeqDelta[A] = {
    val original = chunkToSeqChunk(delta.getOriginal)
    val revised = chunkToSeqChunk(delta.getRevised)
    delta match {
      case i:InsertDelta[A] => SeqDelta(SeqDeltaInsert, original, revised)
      case c:ChangeDelta[A] => SeqDelta(SeqDeltaChange, original, revised)
      case d:DeleteDelta[A] => SeqDelta(SeqDeltaDelete, original, revised)
    }
  }

  def seqChunkToChunk(chunk: SeqChunk[A]) : Chunk[A] = new Chunk[A](chunk.position, chunk.lines.asJava)

  def seqDeltaToDelta(seqDelta: SeqDelta[A]) : Delta[A] = {
    val original = seqChunkToChunk(seqDelta.original)
    val revised = seqChunkToChunk(seqDelta.revised)
    seqDelta._type match {
      case SeqDeltaInsert => new InsertDelta[A](original, revised)
      case SeqDeltaChange => new ChangeDelta[A](original, revised)
      case SeqDeltaDelete => new DeleteDelta[A](original, revised)
    }
  }
  
  override def calcDiff(oldValue: M[A], newValue: M[A]): Option[Patch] = {
    val jPatch = DiffUtils.diff(oldValue.asJava, newValue.asJava)
    if(jPatch.getDeltas.isEmpty) {
      None
    } else {
      Some(SeqPatch(jPatch.getDeltas.asScala.iterator.map(deltaToSeqDelta).toVector))
    }
  }

  override def applyPatch(value: M[A], patch: Patch): M[A] = {
    val builder = cbf()
    val jPatch = new difflib.Patch[A]
    patch.oomSeqDelta.foreach(seqDelta => jPatch.addDelta(seqDeltaToDelta(seqDelta)))
    jPatch.applyTo(value.asJava).iterator.asScala.foreach(builder.+=)
    builder.result()
  }

}
