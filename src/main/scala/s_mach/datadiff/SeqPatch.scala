package s_mach.datadiff

case class SeqChunk[A](position: Int, lines: Vector[A])

sealed trait SeqDeltaType
case object SeqDeltaInsert extends SeqDeltaType
case object SeqDeltaChange extends SeqDeltaType
case object SeqDeltaDelete extends SeqDeltaType

case class SeqDelta[A](
  _type: SeqDeltaType,
  original: SeqChunk[A],
  revised: SeqChunk[A]
)

case class SeqPatch[A](oomSeqDelta: Vector[SeqDelta[A]])

