package s_mach

import s_mach.datadiff.impl._

package object datadiff extends AllDataDiffImplicits {
  trait InferDataDiff[A] {
    def infer[P](implicit ev:DataDiff[A,P]) : DataDiff[A,P]
  }
  def dataDiff[A] = new InferDataDiff[A] {
    def infer[P](implicit aDiff:DataDiff[A,P]) = aDiff
  }

  implicit class SMach_Datadiff_PimpEverything[A](val self: A) extends AnyVal {
    def calcDiff[Patch](
      other: A
    )(implicit
      aDiff:DataDiff[A,Patch]
    ) : Option[Patch] =
      aDiff.calcDiff(self, other)

    def -->?[Patch](
      other: A
    )(implicit
      aDiff:DataDiff[A,Patch]
    ) : Option[Patch] =
      aDiff.calcDiff(self, other)

    def applyPatch[Patch](
      patch: Patch
    )(implicit
      aDiff:DataDiff[A,Patch]
    ) : A = aDiff.applyPatch(self, patch)

    def applyPatch[Patch](
      optPatch: Option[Patch]
    )(implicit
      aDiff:DataDiff[A,Patch]
    ) : A =
      optPatch match {
        case Some(patch) => aDiff.applyPatch(self, patch)
        case None => self
      }

    def |<--[Patch](
      optPatch: Option[Patch]
    )(implicit
      aDiff:DataDiff[A,Patch]
    ) : A = applyPatch(optPatch)
  }
}