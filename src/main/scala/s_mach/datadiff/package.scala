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
package s_mach

package object datadiff extends
  TupleDataDiffImplicits with
  CollectionDataDiffImplicits with
  DataTypeDataDiffImplicits {
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