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

import s_mach.datadiff.impl.SimpleDataDiff

trait AllBuiltInDataDiffImplicits {
  implicit object DataDiff_Boolean extends SimpleDataDiff[Boolean]
  implicit object DataDiff_Byte extends SimpleDataDiff[Byte]
  implicit object DataDiff_Short extends SimpleDataDiff[Short]
  implicit object DataDiff_Int extends SimpleDataDiff[Int]
  implicit object DataDiff_Long extends SimpleDataDiff[Long]
  implicit object DataDiff_Float extends SimpleDataDiff[Float]
  implicit object DataDiff_Double extends SimpleDataDiff[Double]
  implicit object DataDiff_Char extends SimpleDataDiff[Char]
  implicit object DataDiff_String extends SimpleDataDiff[String]
  implicit object DataDiff_BigInt extends SimpleDataDiff[BigInt]
  implicit object DataDiff_BigDecimal extends SimpleDataDiff[BigDecimal]
}
