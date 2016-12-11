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
 * A case class for a patch of a set
 *
 * @param add the items added to the set
 * @param remove the items removed from the set
 * @tparam A the value type
 */
case class SetPatch[A](
  add: Set[A], // Note: set is invariant for A
  remove: Set[A]
)

object SetPatch {
  val _noChange = SetPatch(Set.empty[Any], Set.empty[Any])
  def noChange[A] = _noChange.asInstanceOf[SetPatch[A]]
}