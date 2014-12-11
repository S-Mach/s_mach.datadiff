package s_mach.datadiff

import scala.language.higherKinds
import s_mach.datadiff.impl.SeqDataDiffImpl

import scala.collection.generic.CanBuildFrom

class SeqDataDiff[A,M[AA] <: Seq[AA]](implicit
  cbf:CanBuildFrom[Nothing, A, M[A]]
) extends SeqDataDiffImpl[A,M]
