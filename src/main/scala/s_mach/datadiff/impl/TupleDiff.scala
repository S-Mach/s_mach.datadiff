package s_mach.datadiff.impl

import s_mach.datadiff.DataDiff

class Tuple2DataDiff[A,B,PA,PB](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB]
) extends DataDiff[(A,B),(Option[PA],Option[PB])] {
  type TupleType = (A,B)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    if(aPatch.isEmpty && bPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    (a,b)
  }
}

class Tuple3DataDiff[A,B,C,PA,PB,PC](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC]
) extends DataDiff[(A,B,C),(Option[PA],Option[PB],Option[PC])] {
  type TupleType = (A,B,C)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    (a,b,c)
  }
}