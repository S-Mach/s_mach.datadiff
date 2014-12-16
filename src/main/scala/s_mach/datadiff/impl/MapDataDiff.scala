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
package s_mach.datadiff.impl

import s_mach.datadiff.{MapPatch, DataDiff}

class MapDataDiff[A,B,P](implicit
  bDiff: DataDiff[B,P]
) extends DataDiff[Map[A,B],MapPatch[A,B,P]] {
  override def calcDiff(oldValue: Map[A,B], newValue: Map[A,B]): Option[Patch] = {
    val removeBuilder = Set.newBuilder[A]
    val changeBuilder = Map.newBuilder[A,P]
    oldValue.foreach { case (a,oldB) =>
      newValue.get(a) match {
        case Some(newB) =>
          bDiff.calcDiff(oldB, newB) match {
            case Some(patch) =>
              changeBuilder += ((a, patch))
            case None =>
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
      None
    } else {
      Some(MapPatch(add, remove, change))
    }
  }

  override def applyPatch(value: Map[A,B], patch: Patch): Map[A,B] = {
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
  }

}