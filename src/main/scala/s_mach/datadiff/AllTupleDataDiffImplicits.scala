package s_mach.datadiff

import s_mach.datadiff.impl._

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


  implicit def mkTuple4Diff[A,B,C,D,PA,PB,PC,PD](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD]
  ) = new Tuple4DataDiff[A,B,C,D,PA,PB,PC,PD]


  implicit def mkTuple5Diff[A,B,C,D,E,PA,PB,PC,PD,PE](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD],
    eDiff: DataDiff[E,PE]
  ) = new Tuple5DataDiff[A,B,C,D,E,PA,PB,PC,PD,PE]


  implicit def mkTuple6Diff[A,B,C,D,E,F,PA,PB,PC,PD,PE,PF](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD],
    eDiff: DataDiff[E,PE],
    fDiff: DataDiff[F,PF]
  ) = new Tuple6DataDiff[A,B,C,D,E,F,PA,PB,PC,PD,PE,PF]


  implicit def mkTuple7Diff[A,B,C,D,E,F,G,PA,PB,PC,PD,PE,PF,PG](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD],
    eDiff: DataDiff[E,PE],
    fDiff: DataDiff[F,PF],
    gDiff: DataDiff[G,PG]
  ) = new Tuple7DataDiff[A,B,C,D,E,F,G,PA,PB,PC,PD,PE,PF,PG]


  implicit def mkTuple8Diff[A,B,C,D,E,F,G,H,PA,PB,PC,PD,PE,PF,PG,PH](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD],
    eDiff: DataDiff[E,PE],
    fDiff: DataDiff[F,PF],
    gDiff: DataDiff[G,PG],
    hDiff: DataDiff[H,PH]
  ) = new Tuple8DataDiff[A,B,C,D,E,F,G,H,PA,PB,PC,PD,PE,PF,PG,PH]


  implicit def mkTuple9Diff[A,B,C,D,E,F,G,H,I,PA,PB,PC,PD,PE,PF,PG,PH,PI](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD],
    eDiff: DataDiff[E,PE],
    fDiff: DataDiff[F,PF],
    gDiff: DataDiff[G,PG],
    hDiff: DataDiff[H,PH],
    iDiff: DataDiff[I,PI]
  ) = new Tuple9DataDiff[A,B,C,D,E,F,G,H,I,PA,PB,PC,PD,PE,PF,PG,PH,PI]


  implicit def mkTuple10Diff[A,B,C,D,E,F,G,H,I,J,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ](implicit
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
  ) = new Tuple10DataDiff[A,B,C,D,E,F,G,H,I,J,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ]


  implicit def mkTuple11Diff[A,B,C,D,E,F,G,H,I,J,K,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK](implicit
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
  ) = new Tuple11DataDiff[A,B,C,D,E,F,G,H,I,J,K,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK]


  implicit def mkTuple12Diff[A,B,C,D,E,F,G,H,I,J,K,L,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL](implicit
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
  ) = new Tuple12DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL]


  implicit def mkTuple13Diff[A,B,C,D,E,F,G,H,I,J,K,L,M,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM](implicit
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
  ) = new Tuple13DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM]


  implicit def mkTuple14Diff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN](implicit
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
  ) = new Tuple14DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN]


  implicit def mkTuple15Diff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO](implicit
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
  ) = new Tuple15DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO]


  implicit def mkTuple16Diff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP](implicit
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
  ) = new Tuple16DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP]


  implicit def mkTuple17Diff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ](implicit
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
  ) = new Tuple17DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ]


  implicit def mkTuple18Diff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR](implicit
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
  ) = new Tuple18DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR]


  implicit def mkTuple19Diff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS](implicit
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
  ) = new Tuple19DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS]


  implicit def mkTuple20Diff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT](implicit
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
  ) = new Tuple20DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT]


  implicit def mkTuple21Diff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT,PU](implicit
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
  ) = new Tuple21DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT,PU]


  implicit def mkTuple22Diff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT,PU,PV](implicit
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
  ) = new Tuple22DataDiff[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT,PU,PV]

}
