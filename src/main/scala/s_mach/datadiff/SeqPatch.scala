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

/**
 * A case class for a patch against a sequence of values
 *
 * Note: the current representation is based on
 * https://code.google.com/p/java-diff-utils/ which is used internally to
 * generate and apply patches. It stores the previous value as part of the
 * patch, unlike all other patch types. The original value will eventually be
 * removed in a later version and should not be used.
 *
 * @param zomDelta zero or more deltas
 * @tparam A the value type
 */
case class SeqPatch[+A](zomDelta: Vector[SeqPatch.Delta[A]])

object SeqPatch {
  case class Chunk[+A](position: Int, lines: Vector[A])

  sealed trait DeltaType
  case object Insert extends DeltaType
  case object Change extends DeltaType
  case object Delete extends DeltaType

  case class Delta[+A](
    _type: DeltaType,
    @deprecated("do not use","1.0.0") original: Chunk[A],
    revised: Chunk[A]
  )

  val noChange = SeqPatch(Vector.empty)
}

