/*
                    ,i::,
               :;;;;;;;
              ;:,,::;.
            1ft1;::;1tL
              t1;::;1,
               :;::;               _____        __  ___              __
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

case class SeqChunk[A](position: Int, lines: Vector[A])

sealed trait SeqDeltaType
case object SeqDeltaInsert extends SeqDeltaType
case object SeqDeltaChange extends SeqDeltaType
case object SeqDeltaDelete extends SeqDeltaType

case class SeqDelta[A](
  _type: SeqDeltaType,
  original: SeqChunk[A],
  revised: SeqChunk[A]
)

case class SeqPatch[A](oomSeqDelta: Vector[SeqDelta[A]])

