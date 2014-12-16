package s_mach.datadiff

import s_mach.datadiff.impl.{MapDataDiff, OptionDataDiff, SeqDataDiffImpl, SetDataDiff}

import scala.collection.generic.CanBuildFrom

/**
 * Created by lgatlin on 12/16/14.
 */
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
