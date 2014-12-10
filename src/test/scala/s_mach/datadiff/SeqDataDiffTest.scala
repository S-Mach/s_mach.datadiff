package s_mach.datadiff

import org.scalatest.{Matchers, FlatSpec}

class SeqDataDiffTest extends FlatSpec with Matchers {

  val seq1 = Seq(1,2,3,4)
  val seq2 = Seq(2,7,4,5)

  "SeqDiff.diff" must "detect differences between the old and new value" in {
    val deltas = Vector(
      SeqDelta(
        _type = SeqDeltaDelete,
        original = SeqChunk(0,Vector(1)),
        revised = SeqChunk(0,Vector.empty)
      ),
      SeqDelta(
        _type = SeqDeltaChange,
        original = SeqChunk(2,Vector(3)),
        revised = SeqChunk(1,Vector(7))
      ),
      SeqDelta(
        _type = SeqDeltaInsert,
        original = SeqChunk(4,Vector.empty),
        revised = SeqChunk(3,Vector(5))
      )
    )

    seq1 -->? seq2 should equal(Some(SeqPatch(deltas)))
    seq1 -->? seq1 should equal(None)
  }

  "SeqDiff.patch" must "apply changes to an old value to achieve new value" in {
    val d = seq1 -->? seq2
    seq1 |<-- d should equal(seq2)
  }

}
