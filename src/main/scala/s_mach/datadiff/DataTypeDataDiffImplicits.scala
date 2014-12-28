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

import s_mach.datadiff.impl._

trait DataTypeDataDiffImplicits {
  implicit object DataDiff_Boolean extends BooleanDataDiffImpl
  type BooleanPatch = DataDiff_Boolean.Patch
  implicit object DataDiff_Byte extends NumericDataDiffImpl[Byte]
  type BytePatch = DataDiff_Byte.Patch
  implicit object DataDiff_Short extends NumericDataDiffImpl[Short]
  type ShortPatch = DataDiff_Short.Patch
  implicit object DataDiff_Int extends NumericDataDiffImpl[Int]
  type IntPatch = DataDiff_Int.Patch
  implicit object DataDiff_Long extends NumericDataDiffImpl[Long]
  type LongPatch = DataDiff_Long.Patch
  implicit object DataDiff_Float extends NumericDataDiffImpl[Float]
  type FloatPatch = DataDiff_Float.Patch
  implicit object DataDiff_Double extends NumericDataDiffImpl[Double]
  type DoublePatch = DataDiff_Double.Patch
  implicit object DataDiff_Char extends NumericDataDiffImpl[Char]
  type CharPatch = DataDiff_Char.Patch
  implicit object DataDiff_String extends SimpleDataDiffImpl[String]
  type StringPatch = DataDiff_String.Patch
  implicit object DataDiff_BigInt extends NumericDataDiffImpl[BigInt]
  type BigIntPatch = DataDiff_BigInt.Patch
  implicit object DataDiff_BigDecimal extends NumericDataDiffImpl[BigDecimal]
  type BigDecimalPatch = DataDiff_BigDecimal.Patch
}
