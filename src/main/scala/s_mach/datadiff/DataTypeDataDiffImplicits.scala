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

import s_mach.datadiff.impl.{NumericDataDiffImpl, SimpleDataDiff}

trait DataTypeDataDiffImplicits {
  implicit object DataDiff_Boolean extends DataDiff[Boolean, Boolean] {
    override val noChange = false

    override def calcDiff(oldValue: Boolean, newValue: Boolean): Boolean = {
      oldValue == newValue
    }

    override def applyPatch(value: Boolean, patch: Boolean): Boolean = {
      if(patch) {
        !value
      } else {
        value
      }
    }
  }
  type BooleanPatch = Boolean
  implicit object DataDiff_Byte extends NumericDataDiffImpl[Byte]
  implicit object DataDiff_Short extends NumericDataDiffImpl[Short]
  implicit object DataDiff_Int extends NumericDataDiffImpl[Int]
  type IntPatch = Int
  implicit object DataDiff_Long extends NumericDataDiffImpl[Long]
  implicit object DataDiff_Float extends NumericDataDiffImpl[Float]
  implicit object DataDiff_Double extends NumericDataDiffImpl[Double]
  implicit object DataDiff_Char extends NumericDataDiffImpl[Char]
  implicit object DataDiff_String extends SimpleDataDiff[String]
  type StringPatch = DataDiff_String.Patch
  implicit object DataDiff_BigInt extends NumericDataDiffImpl[BigInt]
  implicit object DataDiff_BigDecimal extends NumericDataDiffImpl[BigDecimal]
}
