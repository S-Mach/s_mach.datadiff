package s_mach.datadiff

import difflib._
import org.scalatest.{Matchers, FlatSpec}
import s_mach.datadiff.impl.SeqPatch
import scala.collection.JavaConverters._
import scala.util.{Failure, Try}

class SeqDiffTest extends FlatSpec with Matchers {

  val seq1 = Seq(1,2,3)
  val seq2 = Seq(2,3,4)
  val aDiff = implicitly[Diff[Seq[Int],SeqPatch[Int]]]

  "SeqDiff.diff" must "detect differences between the old and new value" in {
    val deltas = Vector(
      new DeleteDelta[Int](
        new Chunk[Int](0,List(1).asJava),
        new Chunk[Int](0,List.empty[Int].asJava)
      ),
      new InsertDelta[Int](
        new Chunk[Int](3,List.empty[Int].asJava),
        new Chunk[Int](2,List(4).asJava)
      )
    )

    seq1 -->? seq2 should equal(Some(SeqPatch(deltas)))
    seq1 -->? seq1 should equal(None)
  }

  "SeqDiff.patch" must "apply changes to an old value to achieve new value" in {
    val d = seq1 -->? seq2
    seq1 |<-- d should equal(seq2)
  }

  "SeqDiff.valuetoPatch" must "make a change from a value" in {
    val deltas = Vector(
      new InsertDelta[Int](
        new Chunk[Int](0,List.empty[Int].asJava),
        new Chunk[Int](0,List(1,2,3).asJava)
      )
    )

    aDiff.valueToPatch(seq1) should equal(SeqPatch(deltas))
  }

  "SeqDiff.canPatchToValue" must "always be true" in {
    val deltas1 = Vector(
      new InsertDelta[Int](
        new Chunk[Int](0,List.empty[Int].asJava),
        new Chunk[Int](0,List(1,2,3).asJava)
      )
    )
    aDiff.canPatchToValue(SeqPatch(deltas1)) should equal(true)

    val deltas2 = Vector(
      new DeleteDelta[Int](
        new Chunk[Int](0,List(1).asJava),
        new Chunk[Int](0,List.empty[Int].asJava)
      ),
      new InsertDelta[Int](
        new Chunk[Int](3,List.empty[Int].asJava),
        new Chunk[Int](2,List(4).asJava)
      )
    )
    aDiff.canPatchToValue(SeqPatch(deltas2)) should equal(false)
  }

  "SeqDiff.patchToValue" must "make a value from a change" in {
    val deltas1 = Vector(
      new InsertDelta[Int](
        new Chunk[Int](0,List.empty[Int].asJava),
        new Chunk[Int](0,List(1,2,3).asJava)
      )
    )
    aDiff.patchToValue(SeqPatch(deltas1)) should equal(Seq(1,2,3))

    val deltas2 = Vector(
      new DeleteDelta[Int](
        new Chunk[Int](0,List(1).asJava),
        new Chunk[Int](0,List.empty[Int].asJava)
      ),
      new InsertDelta[Int](
        new Chunk[Int](3,List.empty[Int].asJava),
        new Chunk[Int](2,List(4).asJava)
      )
    )

    {
      val result = Try(aDiff.patchToValue(SeqPatch(deltas2)))
      result shouldBe a [Failure[_]]
      result.failed.get shouldBe a [PatchNotCompleteException]
    }

  }
}