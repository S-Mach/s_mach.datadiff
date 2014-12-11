package s_mach.datadiff.impl

import scala.language.higherKinds
import s_mach.datadiff.DataDiff

import scala.collection.generic.CanBuildFrom

trait AllCollectionDataDiffImplicits {
  implicit def mkOptionDataDiff[A,Patch](implicit
    aDiff:DataDiff[A,Patch]
  ) = new OptionDataDiff[A,Patch]
  implicit def mkSetDataDiff[A] = new SetDataDiff[A]
  implicit def mkSeqDataDiff[A,M[AA] <: Seq[AA]](implicit
    cbf: CanBuildFrom[Nothing, A, M[A]]
  ) = new SeqDataDiffImpl[A,M]
  implicit def mkMapDataDiff[A,B,Patch](implicit
    bDiff:DataDiff[B,Patch]
  ) = new MapDataDiff[A,B,Patch]
}
