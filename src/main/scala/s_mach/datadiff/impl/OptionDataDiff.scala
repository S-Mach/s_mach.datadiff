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
package s_mach.datadiff.impl

import s_mach.datadiff.{OptionPatch, DataDiff}

class AppliedInnerPatchToNoneException extends RuntimeException

class OptionDataDiff[A,P](implicit
  aDiff: DataDiff[A,P]
) extends DataDiff[Option[A],OptionPatch[A,P]] {
  // Note: some impls may build diff at same time equality is tested
  override def calcDiff(optOldValue: Option[A], optNewValue: Option[A]): Option[OptionPatch[A,P]] = {
    optOldValue match {
      // Old was set
      case Some(oldValue) =>
        optNewValue match {
          case Some(newValue) =>
            // Using map/Some.apply here so that if there is no diff between
            // old and new then result is None
            aDiff.calcDiff(oldValue,newValue).map { patch =>
              OptionPatch.ApplyInnerPatch(patch)
            }
          case None => Some(OptionPatch.SetNone)
        }
        
      // Old value was unset
      case None =>
        optNewValue match {
          // If new value is set, need to convert it to a patch since no old value to diff against
          case Some(newValue) => Some(OptionPatch.SetValue(newValue))
          case None => None
        }
    }
  }

  override def applyPatch(optValue: Option[A], patch: OptionPatch[A,P]): Option[A] = {
    patch match {
      // Patch value to Some(A), extract inner patch for A
      case OptionPatch.ApplyInnerPatch(aPatch) =>
        optValue match {
          case Some(value) =>
            Some(aDiff.applyPatch(value, aPatch))
          // Value has no real value to patch against
          case None =>
            throw new AppliedInnerPatchToNoneException
        }
      case OptionPatch.SetValue(aValue) => Some(aValue)
      // Patch value to None
      case OptionPatch.SetNone => None
    }
  }

}
