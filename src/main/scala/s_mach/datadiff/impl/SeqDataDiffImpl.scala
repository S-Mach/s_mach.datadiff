/*
                    ,i::,
               :;;;;;;;
              ;:,,::;.
            1ft1;::;1tL
              t1;::;1,
               :;::;               _____       __  ___              __
          fCLff ;:: tfLLC         / ___/      /  |/  /____ _ _____ / /_
         CLft11 :,, i1tffLi       \__ \ ____ / /|_/ // __ `// ___// __ \
         1t1i   .;;   .1tf       ___/ //___// /  / // /_/ // /__ / / / /
       CLt1i    :,:    .1tfL.   /____/     /_/  /_/ \__,_/ \___//_/ /_/
       Lft1,:;:       , 1tfL:
       ;it1i ,,,:::;;;::1tti      s_mach.datadiff
         .t1i .,::;;; ;1tt        Copyright (c) 2014 S-Mach, Inc.
         Lft11ii;::;ii1tfL:       Author: lance.gatlin@gmail.com
          .L1 1tt1ttt,,Li
            ...1LLLL...
*/
package s_mach.datadiff.impl

import scala.language.higherKinds
import scala.collection.generic.CanBuildFrom
import scala.collection.JavaConverters._
import difflib.{ DiffUtils, Chunk => JChunk, Delta => JDelta, InsertDelta, ChangeDelta, DeleteDelta }
import s_mach.datadiff._

class SeqDataDiffImpl[A,M[AA] <: Seq[AA]](implicit
  cbf:CanBuildFrom[Nothing, A, M[A]]
) extends DataDiff[M[A],SeqPatch[A]] {
  import SeqPatch._
  
  val noChange = SeqPatch.noChange

  def jchunkToChunk(jchunk: JChunk[A]) : Chunk[A] = {
    Chunk(jchunk.getPosition, jchunk.getLines.asScala.toVector)
  }

  def jdeltaToDelta(jdelta: JDelta[A]) : Delta[A] = {
    val original = jchunkToChunk(jdelta.getOriginal)
    val revised = jchunkToChunk(jdelta.getRevised)
    jdelta match {
      case i:InsertDelta[A] => Delta(Insert, original, revised)
      case c:ChangeDelta[A] => Delta(Change, original, revised)
      case d:DeleteDelta[A] => Delta(Delete, original, revised)
    }
  }

  def chunkToJChunk(chunk: Chunk[A]) : JChunk[A] = new JChunk[A](chunk.position, chunk.lines.asJava)

  def deltaToJDelta(delta: Delta[A]) : JDelta[A] = {
    val original = chunkToJChunk(delta.original)
    val revised = chunkToJChunk(delta.revised)
    delta._type match {
      case Insert => new InsertDelta[A](original, revised)
      case Change => new ChangeDelta[A](original, revised)
      case Delete => new DeleteDelta[A](original, revised)
    }
  }
  
  override def calcDiff(oldValue: M[A], newValue: M[A]): Patch = {
    val jPatch = DiffUtils.diff(oldValue.asJava, newValue.asJava)
    if(jPatch.getDeltas.isEmpty) {
      noChange
    } else {
      SeqPatch(jPatch.getDeltas.asScala.iterator.map(jdeltaToDelta).toVector)
    }
  }

  override def applyPatch(value: M[A], patch: Patch): M[A] = {
    if(patch != noChange) {
      val builder = cbf()
      val jPatch = new difflib.Patch[A]
      patch.zomDelta.foreach(delta => jPatch.addDelta(deltaToJDelta(delta)))
      jPatch.applyTo(value.asJava).iterator.asScala.foreach(builder.+=)
      builder.result()
    } else {
      value
    }
  }

}
