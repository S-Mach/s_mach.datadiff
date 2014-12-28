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
package s_mach.datadiff

/* WARNING: Generated code. To modify see s_mach.datadiff.AllTupleDataDiffImplicits */

trait TupleDataDiffImplicits {

  implicit def mkTuple2Diff[A,B,PA,PB](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB]
  ) : DataDiff[(A,B),(PA,PB)] =
    DataDiff.forProductType[(A,B),(PA,PB)]

  implicit def mkTuple3Diff[A,B,C,PA,PB,PC](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC]
  ) : DataDiff[(A,B,C),(PA,PB,PC)] =
    DataDiff.forProductType[(A,B,C),(PA,PB,PC)]


  implicit def mkTuple4Diff[A,B,C,D,PA,PB,PC,PD](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD]
  ) : DataDiff[(A,B,C,D),(PA,PB,PC,PD)] =
    DataDiff.forProductType[(A,B,C,D),(PA,PB,PC,PD)]


  implicit def mkTuple5Diff[A,B,C,D,E,PA,PB,PC,PD,PE](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD],
    eDiff: DataDiff[E,PE]
  ) : DataDiff[(A,B,C,D,E),(PA,PB,PC,PD,PE)] =
    DataDiff.forProductType[(A,B,C,D,E),(PA,PB,PC,PD,PE)]


  implicit def mkTuple6Diff[A,B,C,D,E,F,PA,PB,PC,PD,PE,PF](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD],
    eDiff: DataDiff[E,PE],
    fDiff: DataDiff[F,PF]
  ) : DataDiff[(A,B,C,D,E,F),(PA,PB,PC,PD,PE,PF)] =
    DataDiff.forProductType[(A,B,C,D,E,F),(PA,PB,PC,PD,PE,PF)]


  implicit def mkTuple7Diff[A,B,C,D,E,F,G,PA,PB,PC,PD,PE,PF,PG](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD],
    eDiff: DataDiff[E,PE],
    fDiff: DataDiff[F,PF],
    gDiff: DataDiff[G,PG]
  ) : DataDiff[(A,B,C,D,E,F,G),(PA,PB,PC,PD,PE,PF,PG)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G),(PA,PB,PC,PD,PE,PF,PG)]


  implicit def mkTuple8Diff[A,B,C,D,E,F,G,H,PA,PB,PC,PD,PE,PF,PG,PH](implicit
    aDiff: DataDiff[A,PA],
    bDiff: DataDiff[B,PB],
    cDiff: DataDiff[C,PC],
    dDiff: DataDiff[D,PD],
    eDiff: DataDiff[E,PE],
    fDiff: DataDiff[F,PF],
    gDiff: DataDiff[G,PG],
    hDiff: DataDiff[H,PH]
  ) : DataDiff[(A,B,C,D,E,F,G,H),(PA,PB,PC,PD,PE,PF,PG,PH)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H),(PA,PB,PC,PD,PE,PF,PG,PH)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I),(PA,PB,PC,PD,PE,PF,PG,PH,PI)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I),(PA,PB,PC,PD,PE,PF,PG,PH,PI)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I,J),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I,J,K),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I,J,K,L),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I,J,K,L,M),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I,J,K,L,M,N),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT,PU)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT,PU)]


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
  ) : DataDiff[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT,PU,PV)] =
    DataDiff.forProductType[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V),(PA,PB,PC,PD,PE,PF,PG,PH,PI,PJ,PK,PL,PM,PN,PO,PP,PQ,PR,PS,PT,PU,PV)]

}

