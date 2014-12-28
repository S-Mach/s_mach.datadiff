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

import scala.language.higherKinds
import scala.collection.generic.CanBuildFrom
import s_mach.datadiff.impl.{MapDataDiffImpl, OptionDataDiff, SeqDataDiffImpl, SetDataDiff}

trait CollectionDataDiffImplicits {
  implicit def mkOptionDataDiff[A,Patch](implicit
    aDiff:DataDiff[A,Patch]
  ) = new OptionDataDiff[A,Patch]
  implicit def mkSetDataDiff[A] = new SetDataDiff[A]
  implicit def mkSeqDataDiff[A,M[AA] <: Seq[AA]](implicit
    cbf: CanBuildFrom[Nothing, A, M[A]]
  ) = new SeqDataDiffImpl[A,M]
  implicit def mkMapDataDiff[A,B,Patch](implicit
    bDiff:DataDiff[B,Patch]
  ) = new MapDataDiffImpl[A,B,Patch]
}
