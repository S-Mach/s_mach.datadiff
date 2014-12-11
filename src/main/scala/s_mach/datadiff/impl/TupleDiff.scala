package s_mach.datadiff.impl

/* WARNING: Generated code. To modify see s_mach.datadiff.codegen.TupleDataDiffCodeGen */

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


class Tuple4DataDiff[A,B,C,D,PA,PB,PC,PD](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD]
) extends DataDiff[(A,B,C,D),(Option[PA],Option[PB],Option[PC],Option[PD])] {
  type TupleType = (A,B,C,D)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    (a,b,c,d)
  }
}


class Tuple5DataDiff[A,B,C,D,E,PA,PB,PC,PD,PE](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE]
) extends DataDiff[(A,B,C,D,E),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE])] {
  type TupleType = (A,B,C,D,E)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    (a,b,c,d,e)
  }
}


class Tuple6DataDiff[A,B,C,D,E,F,PA,PB,PC,PD,PE,PF](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF]
) extends DataDiff[(A,B,C,D,E,F),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF])] {
  type TupleType = (A,B,C,D,E,F)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    (a,b,c,d,e,f)
  }
}


class Tuple7DataDiff[A,B,C,D,E,F,G,PA,PB,PC,PD,PE,PF,PG](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG]
) extends DataDiff[(A,B,C,D,E,F,G),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG])] {
  type TupleType = (A,B,C,D,E,F,G)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    (a,b,c,d,e,f,g)
  }
}


class Tuple8DataDiff[A,B,C,D,E,F,G,H,PA,PB,PC,PD,PE,PF,PG,PH](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH]
) extends DataDiff[(A,B,C,D,E,F,G,H),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH])] {
  type TupleType = (A,B,C,D,E,F,G,H)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    (a,b,c,d,e,f,g,h)
  }
}


class Tuple9DataDiff[A,B,C,D,E,F,G,H,I,PA,PB,PC,PD,PE,PF,PG,PH,PI](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI]
) extends DataDiff[(A,B,C,D,E,F,G,H,I),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI])] {
  type TupleType = (A,B,C,D,E,F,G,H,I)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    (a,b,c,d,e,f,g,h,i)
  }
}


class Tuple10DataDiff[A,B,C,D,E,F,G,H,I,J,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI],
  jDiff: DataDiff[J,PJ]
) extends DataDiff[(A,B,C,D,E,F,G,H,I,J),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ])] {
  type TupleType = (A,B,C,D,E,F,G,H,I,J)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    val jPatch = jDiff.calcDiff(oldValue._10,newValue._10)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty && jPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch,jPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    val j = patch._10.fold(value._10)(jDiff.applyPatch(value._10, _))
    (a,b,c,d,e,f,g,h,i,j)
  }
}


class Tuple11DataDiff[A,B,C,D,E,F,G,H,I,J,K,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI],
  jDiff: DataDiff[J,PJ],
  kDiff: DataDiff[K,PK]
) extends DataDiff[(A,B,C,D,E,F,G,H,I,J,K),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK])] {
  type TupleType = (A,B,C,D,E,F,G,H,I,J,K)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    val jPatch = jDiff.calcDiff(oldValue._10,newValue._10)
    val kPatch = kDiff.calcDiff(oldValue._11,newValue._11)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty && jPatch.isEmpty && kPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch,jPatch,kPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    val j = patch._10.fold(value._10)(jDiff.applyPatch(value._10, _))
    val k = patch._11.fold(value._11)(kDiff.applyPatch(value._11, _))
    (a,b,c,d,e,f,g,h,i,j,k)
  }
}


class Tuple12DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI],
  jDiff: DataDiff[J,PJ],
  kDiff: DataDiff[K,PK],
  lDiff: DataDiff[L,PL]
) extends DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL])] {
  type TupleType = (A,B,C,D,E,F,G,H,I,J,K,L)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    val jPatch = jDiff.calcDiff(oldValue._10,newValue._10)
    val kPatch = kDiff.calcDiff(oldValue._11,newValue._11)
    val lPatch = lDiff.calcDiff(oldValue._12,newValue._12)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty && jPatch.isEmpty && kPatch.isEmpty && lPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch,jPatch,kPatch,lPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    val j = patch._10.fold(value._10)(jDiff.applyPatch(value._10, _))
    val k = patch._11.fold(value._11)(kDiff.applyPatch(value._11, _))
    val l = patch._12.fold(value._12)(lDiff.applyPatch(value._12, _))
    (a,b,c,d,e,f,g,h,i,j,k,l)
  }
}


class Tuple13DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI],
  jDiff: DataDiff[J,PJ],
  kDiff: DataDiff[K,PK],
  lDiff: DataDiff[L,PL],
  mDiff: DataDiff[M,PM]
) extends DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM])] {
  type TupleType = (A,B,C,D,E,F,G,H,I,J,K,L,M)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    val jPatch = jDiff.calcDiff(oldValue._10,newValue._10)
    val kPatch = kDiff.calcDiff(oldValue._11,newValue._11)
    val lPatch = lDiff.calcDiff(oldValue._12,newValue._12)
    val mPatch = mDiff.calcDiff(oldValue._13,newValue._13)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty && jPatch.isEmpty && kPatch.isEmpty && lPatch.isEmpty && mPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch,jPatch,kPatch,lPatch,mPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    val j = patch._10.fold(value._10)(jDiff.applyPatch(value._10, _))
    val k = patch._11.fold(value._11)(kDiff.applyPatch(value._11, _))
    val l = patch._12.fold(value._12)(lDiff.applyPatch(value._12, _))
    val m = patch._13.fold(value._13)(mDiff.applyPatch(value._13, _))
    (a,b,c,d,e,f,g,h,i,j,k,l,m)
  }
}


class Tuple14DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI],
  jDiff: DataDiff[J,PJ],
  kDiff: DataDiff[K,PK],
  lDiff: DataDiff[L,PL],
  mDiff: DataDiff[M,PM],
  nDiff: DataDiff[N,PN]
) extends DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN])] {
  type TupleType = (A,B,C,D,E,F,G,H,I,J,K,L,M,N)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    val jPatch = jDiff.calcDiff(oldValue._10,newValue._10)
    val kPatch = kDiff.calcDiff(oldValue._11,newValue._11)
    val lPatch = lDiff.calcDiff(oldValue._12,newValue._12)
    val mPatch = mDiff.calcDiff(oldValue._13,newValue._13)
    val nPatch = nDiff.calcDiff(oldValue._14,newValue._14)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty && jPatch.isEmpty && kPatch.isEmpty && lPatch.isEmpty && mPatch.isEmpty && nPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch,jPatch,kPatch,lPatch,mPatch,nPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    val j = patch._10.fold(value._10)(jDiff.applyPatch(value._10, _))
    val k = patch._11.fold(value._11)(kDiff.applyPatch(value._11, _))
    val l = patch._12.fold(value._12)(lDiff.applyPatch(value._12, _))
    val m = patch._13.fold(value._13)(mDiff.applyPatch(value._13, _))
    val n = patch._14.fold(value._14)(nDiff.applyPatch(value._14, _))
    (a,b,c,d,e,f,g,h,i,j,k,l,m,n)
  }
}


class Tuple15DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI],
  jDiff: DataDiff[J,PJ],
  kDiff: DataDiff[K,PK],
  lDiff: DataDiff[L,PL],
  mDiff: DataDiff[M,PM],
  nDiff: DataDiff[N,PN],
  oDiff: DataDiff[O,PO]
) extends DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO])] {
  type TupleType = (A,B,C,D,E,F,G,H,I,J,K,L,M,N,O)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    val jPatch = jDiff.calcDiff(oldValue._10,newValue._10)
    val kPatch = kDiff.calcDiff(oldValue._11,newValue._11)
    val lPatch = lDiff.calcDiff(oldValue._12,newValue._12)
    val mPatch = mDiff.calcDiff(oldValue._13,newValue._13)
    val nPatch = nDiff.calcDiff(oldValue._14,newValue._14)
    val oPatch = oDiff.calcDiff(oldValue._15,newValue._15)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty && jPatch.isEmpty && kPatch.isEmpty && lPatch.isEmpty && mPatch.isEmpty && nPatch.isEmpty && oPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch,jPatch,kPatch,lPatch,mPatch,nPatch,oPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    val j = patch._10.fold(value._10)(jDiff.applyPatch(value._10, _))
    val k = patch._11.fold(value._11)(kDiff.applyPatch(value._11, _))
    val l = patch._12.fold(value._12)(lDiff.applyPatch(value._12, _))
    val m = patch._13.fold(value._13)(mDiff.applyPatch(value._13, _))
    val n = patch._14.fold(value._14)(nDiff.applyPatch(value._14, _))
    val o = patch._15.fold(value._15)(oDiff.applyPatch(value._15, _))
    (a,b,c,d,e,f,g,h,i,j,k,l,m,n,o)
  }
}


class Tuple16DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI],
  jDiff: DataDiff[J,PJ],
  kDiff: DataDiff[K,PK],
  lDiff: DataDiff[L,PL],
  mDiff: DataDiff[M,PM],
  nDiff: DataDiff[N,PN],
  oDiff: DataDiff[O,PO],
  pDiff: DataDiff[P,PP]
) extends DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP])] {
  type TupleType = (A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    val jPatch = jDiff.calcDiff(oldValue._10,newValue._10)
    val kPatch = kDiff.calcDiff(oldValue._11,newValue._11)
    val lPatch = lDiff.calcDiff(oldValue._12,newValue._12)
    val mPatch = mDiff.calcDiff(oldValue._13,newValue._13)
    val nPatch = nDiff.calcDiff(oldValue._14,newValue._14)
    val oPatch = oDiff.calcDiff(oldValue._15,newValue._15)
    val pPatch = pDiff.calcDiff(oldValue._16,newValue._16)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty && jPatch.isEmpty && kPatch.isEmpty && lPatch.isEmpty && mPatch.isEmpty && nPatch.isEmpty && oPatch.isEmpty && pPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch,jPatch,kPatch,lPatch,mPatch,nPatch,oPatch,pPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    val j = patch._10.fold(value._10)(jDiff.applyPatch(value._10, _))
    val k = patch._11.fold(value._11)(kDiff.applyPatch(value._11, _))
    val l = patch._12.fold(value._12)(lDiff.applyPatch(value._12, _))
    val m = patch._13.fold(value._13)(mDiff.applyPatch(value._13, _))
    val n = patch._14.fold(value._14)(nDiff.applyPatch(value._14, _))
    val o = patch._15.fold(value._15)(oDiff.applyPatch(value._15, _))
    val p = patch._16.fold(value._16)(pDiff.applyPatch(value._16, _))
    (a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p)
  }
}


class Tuple17DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI],
  jDiff: DataDiff[J,PJ],
  kDiff: DataDiff[K,PK],
  lDiff: DataDiff[L,PL],
  mDiff: DataDiff[M,PM],
  nDiff: DataDiff[N,PN],
  oDiff: DataDiff[O,PO],
  pDiff: DataDiff[P,PP],
  qDiff: DataDiff[Q,PQ]
) extends DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ])] {
  type TupleType = (A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    val jPatch = jDiff.calcDiff(oldValue._10,newValue._10)
    val kPatch = kDiff.calcDiff(oldValue._11,newValue._11)
    val lPatch = lDiff.calcDiff(oldValue._12,newValue._12)
    val mPatch = mDiff.calcDiff(oldValue._13,newValue._13)
    val nPatch = nDiff.calcDiff(oldValue._14,newValue._14)
    val oPatch = oDiff.calcDiff(oldValue._15,newValue._15)
    val pPatch = pDiff.calcDiff(oldValue._16,newValue._16)
    val qPatch = qDiff.calcDiff(oldValue._17,newValue._17)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty && jPatch.isEmpty && kPatch.isEmpty && lPatch.isEmpty && mPatch.isEmpty && nPatch.isEmpty && oPatch.isEmpty && pPatch.isEmpty && qPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch,jPatch,kPatch,lPatch,mPatch,nPatch,oPatch,pPatch,qPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    val j = patch._10.fold(value._10)(jDiff.applyPatch(value._10, _))
    val k = patch._11.fold(value._11)(kDiff.applyPatch(value._11, _))
    val l = patch._12.fold(value._12)(lDiff.applyPatch(value._12, _))
    val m = patch._13.fold(value._13)(mDiff.applyPatch(value._13, _))
    val n = patch._14.fold(value._14)(nDiff.applyPatch(value._14, _))
    val o = patch._15.fold(value._15)(oDiff.applyPatch(value._15, _))
    val p = patch._16.fold(value._16)(pDiff.applyPatch(value._16, _))
    val q = patch._17.fold(value._17)(qDiff.applyPatch(value._17, _))
    (a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q)
  }
}


class Tuple18DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI],
  jDiff: DataDiff[J,PJ],
  kDiff: DataDiff[K,PK],
  lDiff: DataDiff[L,PL],
  mDiff: DataDiff[M,PM],
  nDiff: DataDiff[N,PN],
  oDiff: DataDiff[O,PO],
  pDiff: DataDiff[P,PP],
  qDiff: DataDiff[Q,PQ],
  rDiff: DataDiff[R,PR]
) extends DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR])] {
  type TupleType = (A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    val jPatch = jDiff.calcDiff(oldValue._10,newValue._10)
    val kPatch = kDiff.calcDiff(oldValue._11,newValue._11)
    val lPatch = lDiff.calcDiff(oldValue._12,newValue._12)
    val mPatch = mDiff.calcDiff(oldValue._13,newValue._13)
    val nPatch = nDiff.calcDiff(oldValue._14,newValue._14)
    val oPatch = oDiff.calcDiff(oldValue._15,newValue._15)
    val pPatch = pDiff.calcDiff(oldValue._16,newValue._16)
    val qPatch = qDiff.calcDiff(oldValue._17,newValue._17)
    val rPatch = rDiff.calcDiff(oldValue._18,newValue._18)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty && jPatch.isEmpty && kPatch.isEmpty && lPatch.isEmpty && mPatch.isEmpty && nPatch.isEmpty && oPatch.isEmpty && pPatch.isEmpty && qPatch.isEmpty && rPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch,jPatch,kPatch,lPatch,mPatch,nPatch,oPatch,pPatch,qPatch,rPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    val j = patch._10.fold(value._10)(jDiff.applyPatch(value._10, _))
    val k = patch._11.fold(value._11)(kDiff.applyPatch(value._11, _))
    val l = patch._12.fold(value._12)(lDiff.applyPatch(value._12, _))
    val m = patch._13.fold(value._13)(mDiff.applyPatch(value._13, _))
    val n = patch._14.fold(value._14)(nDiff.applyPatch(value._14, _))
    val o = patch._15.fold(value._15)(oDiff.applyPatch(value._15, _))
    val p = patch._16.fold(value._16)(pDiff.applyPatch(value._16, _))
    val q = patch._17.fold(value._17)(qDiff.applyPatch(value._17, _))
    val r = patch._18.fold(value._18)(rDiff.applyPatch(value._18, _))
    (a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r)
  }
}


class Tuple19DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI],
  jDiff: DataDiff[J,PJ],
  kDiff: DataDiff[K,PK],
  lDiff: DataDiff[L,PL],
  mDiff: DataDiff[M,PM],
  nDiff: DataDiff[N,PN],
  oDiff: DataDiff[O,PO],
  pDiff: DataDiff[P,PP],
  qDiff: DataDiff[Q,PQ],
  rDiff: DataDiff[R,PR],
  sDiff: DataDiff[S,PS]
) extends DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR],Option[PS])] {
  type TupleType = (A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    val jPatch = jDiff.calcDiff(oldValue._10,newValue._10)
    val kPatch = kDiff.calcDiff(oldValue._11,newValue._11)
    val lPatch = lDiff.calcDiff(oldValue._12,newValue._12)
    val mPatch = mDiff.calcDiff(oldValue._13,newValue._13)
    val nPatch = nDiff.calcDiff(oldValue._14,newValue._14)
    val oPatch = oDiff.calcDiff(oldValue._15,newValue._15)
    val pPatch = pDiff.calcDiff(oldValue._16,newValue._16)
    val qPatch = qDiff.calcDiff(oldValue._17,newValue._17)
    val rPatch = rDiff.calcDiff(oldValue._18,newValue._18)
    val sPatch = sDiff.calcDiff(oldValue._19,newValue._19)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty && jPatch.isEmpty && kPatch.isEmpty && lPatch.isEmpty && mPatch.isEmpty && nPatch.isEmpty && oPatch.isEmpty && pPatch.isEmpty && qPatch.isEmpty && rPatch.isEmpty && sPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch,jPatch,kPatch,lPatch,mPatch,nPatch,oPatch,pPatch,qPatch,rPatch,sPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    val j = patch._10.fold(value._10)(jDiff.applyPatch(value._10, _))
    val k = patch._11.fold(value._11)(kDiff.applyPatch(value._11, _))
    val l = patch._12.fold(value._12)(lDiff.applyPatch(value._12, _))
    val m = patch._13.fold(value._13)(mDiff.applyPatch(value._13, _))
    val n = patch._14.fold(value._14)(nDiff.applyPatch(value._14, _))
    val o = patch._15.fold(value._15)(oDiff.applyPatch(value._15, _))
    val p = patch._16.fold(value._16)(pDiff.applyPatch(value._16, _))
    val q = patch._17.fold(value._17)(qDiff.applyPatch(value._17, _))
    val r = patch._18.fold(value._18)(rDiff.applyPatch(value._18, _))
    val s = patch._19.fold(value._19)(sDiff.applyPatch(value._19, _))
    (a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s)
  }
}


class Tuple20DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI],
  jDiff: DataDiff[J,PJ],
  kDiff: DataDiff[K,PK],
  lDiff: DataDiff[L,PL],
  mDiff: DataDiff[M,PM],
  nDiff: DataDiff[N,PN],
  oDiff: DataDiff[O,PO],
  pDiff: DataDiff[P,PP],
  qDiff: DataDiff[Q,PQ],
  rDiff: DataDiff[R,PR],
  sDiff: DataDiff[S,PS],
  tDiff: DataDiff[T,PT]
) extends DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR],Option[PS],Option[PT])] {
  type TupleType = (A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    val jPatch = jDiff.calcDiff(oldValue._10,newValue._10)
    val kPatch = kDiff.calcDiff(oldValue._11,newValue._11)
    val lPatch = lDiff.calcDiff(oldValue._12,newValue._12)
    val mPatch = mDiff.calcDiff(oldValue._13,newValue._13)
    val nPatch = nDiff.calcDiff(oldValue._14,newValue._14)
    val oPatch = oDiff.calcDiff(oldValue._15,newValue._15)
    val pPatch = pDiff.calcDiff(oldValue._16,newValue._16)
    val qPatch = qDiff.calcDiff(oldValue._17,newValue._17)
    val rPatch = rDiff.calcDiff(oldValue._18,newValue._18)
    val sPatch = sDiff.calcDiff(oldValue._19,newValue._19)
    val tPatch = tDiff.calcDiff(oldValue._20,newValue._20)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty && jPatch.isEmpty && kPatch.isEmpty && lPatch.isEmpty && mPatch.isEmpty && nPatch.isEmpty && oPatch.isEmpty && pPatch.isEmpty && qPatch.isEmpty && rPatch.isEmpty && sPatch.isEmpty && tPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch,jPatch,kPatch,lPatch,mPatch,nPatch,oPatch,pPatch,qPatch,rPatch,sPatch,tPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    val j = patch._10.fold(value._10)(jDiff.applyPatch(value._10, _))
    val k = patch._11.fold(value._11)(kDiff.applyPatch(value._11, _))
    val l = patch._12.fold(value._12)(lDiff.applyPatch(value._12, _))
    val m = patch._13.fold(value._13)(mDiff.applyPatch(value._13, _))
    val n = patch._14.fold(value._14)(nDiff.applyPatch(value._14, _))
    val o = patch._15.fold(value._15)(oDiff.applyPatch(value._15, _))
    val p = patch._16.fold(value._16)(pDiff.applyPatch(value._16, _))
    val q = patch._17.fold(value._17)(qDiff.applyPatch(value._17, _))
    val r = patch._18.fold(value._18)(rDiff.applyPatch(value._18, _))
    val s = patch._19.fold(value._19)(sDiff.applyPatch(value._19, _))
    val t = patch._20.fold(value._20)(tDiff.applyPatch(value._20, _))
    (a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t)
  }
}


class Tuple21DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT,PU](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI],
  jDiff: DataDiff[J,PJ],
  kDiff: DataDiff[K,PK],
  lDiff: DataDiff[L,PL],
  mDiff: DataDiff[M,PM],
  nDiff: DataDiff[N,PN],
  oDiff: DataDiff[O,PO],
  pDiff: DataDiff[P,PP],
  qDiff: DataDiff[Q,PQ],
  rDiff: DataDiff[R,PR],
  sDiff: DataDiff[S,PS],
  tDiff: DataDiff[T,PT],
  uDiff: DataDiff[U,PU]
) extends DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR],Option[PS],Option[PT],Option[PU])] {
  type TupleType = (A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    val jPatch = jDiff.calcDiff(oldValue._10,newValue._10)
    val kPatch = kDiff.calcDiff(oldValue._11,newValue._11)
    val lPatch = lDiff.calcDiff(oldValue._12,newValue._12)
    val mPatch = mDiff.calcDiff(oldValue._13,newValue._13)
    val nPatch = nDiff.calcDiff(oldValue._14,newValue._14)
    val oPatch = oDiff.calcDiff(oldValue._15,newValue._15)
    val pPatch = pDiff.calcDiff(oldValue._16,newValue._16)
    val qPatch = qDiff.calcDiff(oldValue._17,newValue._17)
    val rPatch = rDiff.calcDiff(oldValue._18,newValue._18)
    val sPatch = sDiff.calcDiff(oldValue._19,newValue._19)
    val tPatch = tDiff.calcDiff(oldValue._20,newValue._20)
    val uPatch = uDiff.calcDiff(oldValue._21,newValue._21)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty && jPatch.isEmpty && kPatch.isEmpty && lPatch.isEmpty && mPatch.isEmpty && nPatch.isEmpty && oPatch.isEmpty && pPatch.isEmpty && qPatch.isEmpty && rPatch.isEmpty && sPatch.isEmpty && tPatch.isEmpty && uPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch,jPatch,kPatch,lPatch,mPatch,nPatch,oPatch,pPatch,qPatch,rPatch,sPatch,tPatch,uPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    val j = patch._10.fold(value._10)(jDiff.applyPatch(value._10, _))
    val k = patch._11.fold(value._11)(kDiff.applyPatch(value._11, _))
    val l = patch._12.fold(value._12)(lDiff.applyPatch(value._12, _))
    val m = patch._13.fold(value._13)(mDiff.applyPatch(value._13, _))
    val n = patch._14.fold(value._14)(nDiff.applyPatch(value._14, _))
    val o = patch._15.fold(value._15)(oDiff.applyPatch(value._15, _))
    val p = patch._16.fold(value._16)(pDiff.applyPatch(value._16, _))
    val q = patch._17.fold(value._17)(qDiff.applyPatch(value._17, _))
    val r = patch._18.fold(value._18)(rDiff.applyPatch(value._18, _))
    val s = patch._19.fold(value._19)(sDiff.applyPatch(value._19, _))
    val t = patch._20.fold(value._20)(tDiff.applyPatch(value._20, _))
    val u = patch._21.fold(value._21)(uDiff.applyPatch(value._21, _))
    (a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u)
  }
}


class Tuple22DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT,PU,PV](implicit
  aDiff: DataDiff[A,PA],
  bDiff: DataDiff[B,PB],
  cDiff: DataDiff[C,PC],
  dDiff: DataDiff[D,PD],
  eDiff: DataDiff[E,PE],
  fDiff: DataDiff[F,PF],
  gDiff: DataDiff[G,PG],
  hDiff: DataDiff[H,PH],
  iDiff: DataDiff[I,PI],
  jDiff: DataDiff[J,PJ],
  kDiff: DataDiff[K,PK],
  lDiff: DataDiff[L,PL],
  mDiff: DataDiff[M,PM],
  nDiff: DataDiff[N,PN],
  oDiff: DataDiff[O,PO],
  pDiff: DataDiff[P,PP],
  qDiff: DataDiff[Q,PQ],
  rDiff: DataDiff[R,PR],
  sDiff: DataDiff[S,PS],
  tDiff: DataDiff[T,PT],
  uDiff: DataDiff[U,PU],
  vDiff: DataDiff[V,PV]
) extends DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR],Option[PS],Option[PT],Option[PU],Option[PV])] {
  type TupleType = (A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V)
  override def calcDiff(
    oldValue: TupleType,
    newValue: TupleType
  ): Option[Patch] = {
    val aPatch = aDiff.calcDiff(oldValue._1,newValue._1)
    val bPatch = bDiff.calcDiff(oldValue._2,newValue._2)
    val cPatch = cDiff.calcDiff(oldValue._3,newValue._3)
    val dPatch = dDiff.calcDiff(oldValue._4,newValue._4)
    val ePatch = eDiff.calcDiff(oldValue._5,newValue._5)
    val fPatch = fDiff.calcDiff(oldValue._6,newValue._6)
    val gPatch = gDiff.calcDiff(oldValue._7,newValue._7)
    val hPatch = hDiff.calcDiff(oldValue._8,newValue._8)
    val iPatch = iDiff.calcDiff(oldValue._9,newValue._9)
    val jPatch = jDiff.calcDiff(oldValue._10,newValue._10)
    val kPatch = kDiff.calcDiff(oldValue._11,newValue._11)
    val lPatch = lDiff.calcDiff(oldValue._12,newValue._12)
    val mPatch = mDiff.calcDiff(oldValue._13,newValue._13)
    val nPatch = nDiff.calcDiff(oldValue._14,newValue._14)
    val oPatch = oDiff.calcDiff(oldValue._15,newValue._15)
    val pPatch = pDiff.calcDiff(oldValue._16,newValue._16)
    val qPatch = qDiff.calcDiff(oldValue._17,newValue._17)
    val rPatch = rDiff.calcDiff(oldValue._18,newValue._18)
    val sPatch = sDiff.calcDiff(oldValue._19,newValue._19)
    val tPatch = tDiff.calcDiff(oldValue._20,newValue._20)
    val uPatch = uDiff.calcDiff(oldValue._21,newValue._21)
    val vPatch = vDiff.calcDiff(oldValue._22,newValue._22)
    if(aPatch.isEmpty && bPatch.isEmpty && cPatch.isEmpty && dPatch.isEmpty && ePatch.isEmpty && fPatch.isEmpty && gPatch.isEmpty && hPatch.isEmpty && iPatch.isEmpty && jPatch.isEmpty && kPatch.isEmpty && lPatch.isEmpty && mPatch.isEmpty && nPatch.isEmpty && oPatch.isEmpty && pPatch.isEmpty && qPatch.isEmpty && rPatch.isEmpty && sPatch.isEmpty && tPatch.isEmpty && uPatch.isEmpty && vPatch.isEmpty) {
      None
    } else {
      Some((aPatch,bPatch,cPatch,dPatch,ePatch,fPatch,gPatch,hPatch,iPatch,jPatch,kPatch,lPatch,mPatch,nPatch,oPatch,pPatch,qPatch,rPatch,sPatch,tPatch,uPatch,vPatch))
    }
  }

  override def applyPatch(value: TupleType, patch: Patch): TupleType = {
    val a = patch._1.fold(value._1)(aDiff.applyPatch(value._1, _))
    val b = patch._2.fold(value._2)(bDiff.applyPatch(value._2, _))
    val c = patch._3.fold(value._3)(cDiff.applyPatch(value._3, _))
    val d = patch._4.fold(value._4)(dDiff.applyPatch(value._4, _))
    val e = patch._5.fold(value._5)(eDiff.applyPatch(value._5, _))
    val f = patch._6.fold(value._6)(fDiff.applyPatch(value._6, _))
    val g = patch._7.fold(value._7)(gDiff.applyPatch(value._7, _))
    val h = patch._8.fold(value._8)(hDiff.applyPatch(value._8, _))
    val i = patch._9.fold(value._9)(iDiff.applyPatch(value._9, _))
    val j = patch._10.fold(value._10)(jDiff.applyPatch(value._10, _))
    val k = patch._11.fold(value._11)(kDiff.applyPatch(value._11, _))
    val l = patch._12.fold(value._12)(lDiff.applyPatch(value._12, _))
    val m = patch._13.fold(value._13)(mDiff.applyPatch(value._13, _))
    val n = patch._14.fold(value._14)(nDiff.applyPatch(value._14, _))
    val o = patch._15.fold(value._15)(oDiff.applyPatch(value._15, _))
    val p = patch._16.fold(value._16)(pDiff.applyPatch(value._16, _))
    val q = patch._17.fold(value._17)(qDiff.applyPatch(value._17, _))
    val r = patch._18.fold(value._18)(rDiff.applyPatch(value._18, _))
    val s = patch._19.fold(value._19)(sDiff.applyPatch(value._19, _))
    val t = patch._20.fold(value._20)(tDiff.applyPatch(value._20, _))
    val u = patch._21.fold(value._21)(uDiff.applyPatch(value._21, _))
    val v = patch._22.fold(value._22)(vDiff.applyPatch(value._22, _))
    (a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v)
  }
}


