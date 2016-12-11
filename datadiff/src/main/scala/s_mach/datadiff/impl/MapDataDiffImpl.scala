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

import s_mach.datadiff.{MapPatch, DataDiff}

class MapDataDiffImpl[A,B,P](implicit
  bDiff: DataDiff[B,P]
) extends DataDiff[Map[A,B],MapPatch[A,B,P]] {

  override val noChange : MapPatch[A,B,P] = MapPatch.noChange

  override def calcDiff(oldValue: Map[A,B], newValue: Map[A,B]): Patch = {
    val removeBuilder = Set.newBuilder[A]
    val changeBuilder = Map.newBuilder[A,P]
    oldValue.foreach { case (a,oldB) =>
      newValue.get(a) match {
        case Some(newB) =>
          bDiff.calcDiff(oldB, newB) match {
            case bDiff.noChange =>

            case bPatch =>
              changeBuilder += ((a, bPatch))
          }
        case None =>
          removeBuilder += a
      }
    }
    val addBuilder = Map.newBuilder[A,B]
    newValue.iterator
      .filterNot { case (a,_) => oldValue.contains(a) }
      .foreach(addBuilder.+=)

    val add = addBuilder.result()
    val remove = removeBuilder.result()
    val change = changeBuilder.result()
    if(add.isEmpty && remove.isEmpty && change.isEmpty) {
      noChange
    } else {
      MapPatch(add, remove, change)
    }
  }

  override def applyPatch(value: Map[A,B], patch: Patch): Map[A,B] = {
    if(patch != noChange) {
      val builder = Map.newBuilder[A,B]
      builder ++= value.iterator
        .collect { case t@(a,b) if patch.remove.contains(a) == false =>
          patch.change.get(a) match {
            case Some(bPatch) =>
              (a, bDiff.applyPatch(b, bPatch))
            case None => t
          }
        }
      builder ++= patch.add
      builder.result()
    } else {
      value
    }
  }

}