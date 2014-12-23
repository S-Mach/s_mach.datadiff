/*
                    ,i::,
               :;;;;;;;
              ;:,,::;.
            1ft1;::;1tL
              t1;::;1,
               :;::;               _____        __  ___              __
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
package s_mach.datadiff

/* WARNING: Generated code. To modify see s_mach.datadiff.AllTupleDataDiffImplicits */

trait AllTupleDataDiffImplicits {

  implicit def mkTuple2Diff[A,B,PA,PB](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB]
  ) : DataDiff[(A,B),(Option[PA],Option[PB])] =
    mkDataDiff[(A,B),(Option[PA],Option[PB])]


  implicit def mkTuple3Diff[A,B,C,PA,PB,PC](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC]
  ) : DataDiff[(A,B,C),(Option[PA],Option[PB],Option[PC])] =
    mkDataDiff[(A,B,C),(Option[PA],Option[PB],Option[PC])]


  implicit def mkTuple4Diff[A,B,C,D,PA,PB,PC,PD](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD]
  ) : DataDiff[(A,B,C,D),(Option[PA],Option[PB],Option[PC],Option[PD])] =
    mkDataDiff[(A,B,C,D),(Option[PA],Option[PB],Option[PC],Option[PD])]


  implicit def mkTuple5Diff[A,B,C,D,E,PA,PB,PC,PD,PE](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD],
    eDiff: DataDiff[E,PE]
  ) : DataDiff[(A,B,C,D,E),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE])] =
    mkDataDiff[(A,B,C,D,E),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE])]


  implicit def mkTuple6Diff[A,B,C,D,E,F,PA,PB,PC,PD,PE,PF](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD],
    eDiff: DataDiff[E,PE],
    fDiff: DataDiff[F,PF]
  ) : DataDiff[(A,B,C,D,E,F),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF])] =
    mkDataDiff[(A,B,C,D,E,F),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF])]


  implicit def mkTuple7Diff[A,B,C,D,E,F,G,PA,PB,PC,PD,PE,PF,PG](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD],
    eDiff: DataDiff[E,PE],
    fDiff: DataDiff[F,PF],
    gDiff: DataDiff[G,PG]
  ) : DataDiff[(A,B,C,D,E,F,G),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG])] =
    mkDataDiff[(A,B,C,D,E,F,G),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG])]


  implicit def mkTuple8Diff[A,B,C,D,E,F,G,H,PA,PB,PC,PD,PE,PF,PG,PH](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD],
    eDiff: DataDiff[E,PE],
    fDiff: DataDiff[F,PF],
    gDiff: DataDiff[G,PG],
    hDiff: DataDiff[H,PH]
  ) : DataDiff[(A,B,C,D,E,F,G,H),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH])] =
    mkDataDiff[(A,B,C,D,E,F,G,H),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I,J),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I,J,K),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I,J,K,L),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR],Option[PS])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR],Option[PS])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR],Option[PS],Option[PT])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR],Option[PS],Option[PT])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR],Option[PS],Option[PT],Option[PU])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR],Option[PS],Option[PT],Option[PU])]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR],Option[PS],Option[PT],Option[PU],Option[PV])] =
    mkDataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V),(Option[PA],Option[PB],Option[PC],Option[PD],Option[PE],Option[PF],Option[PG],Option[PH],Option[PI],Option[PJ],Option[PK],Option[PL],Option[PM],Option[PN],Option[PO],Option[PP],Option[PQ],Option[PR],Option[PS],Option[PT],Option[PU],Option[PV])]

}

