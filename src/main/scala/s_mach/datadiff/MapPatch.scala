package s_mach.datadiff

case class MapPatch[A,B,P](
  add: Map[A,B],
  remove: Set[A],
  change: Map[A,P]
)