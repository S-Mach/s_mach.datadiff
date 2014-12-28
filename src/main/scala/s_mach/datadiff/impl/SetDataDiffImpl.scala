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

import s_mach.datadiff.{SetPatch, DataDiff}

import scala.collection.generic.CanBuildFrom

class SetDataDiffImpl[A](implicit
  cbf: CanBuildFrom[Nothing, A, Set[A]]
) extends DataDiff[Set[A],SetPatch[A]] {

  override val noChange : SetPatch[A] = SetPatch.noChange

  override def calcDiff(oldValue: Set[A], newValue: Set[A]): Patch = {
    val remove = oldValue -- newValue
    if(remove.isEmpty && oldValue.size == newValue.size) {
      noChange
    } else {
      val add = newValue -- oldValue
      SetPatch(add, remove)
    }
  }

  override def applyPatch(value: Set[A], patch: Patch): Set[A] = {
    val builder = cbf()
    value.iterator.filterNot(patch.remove.contains).foreach(builder.+=)
    builder ++= patch.add
    builder.result()
  }

}
