package s_mach.datadiff.impl

import s_mach.datadiff.DataDiff

trait AllTupleDataDiffImplicits {
  implicit def mkTuple2Diff[A,B,PA,PB](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB]
  ) = new Tuple2DataDiff[A,B,PA,PB]
  implicit def mkTuple3Diff[A,B,C,PA,PB,PC](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC]
  ) = new Tuple3DataDiff[A,B,C,PA,PB,PC]
}

