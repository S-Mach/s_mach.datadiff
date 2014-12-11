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

import org.scalatest.{Matchers, FlatSpec}

class MapDataDiffTest extends FlatSpec with Matchers {

  val map1 = Map(1 -> "a",2 -> "b",3 -> "c")
  val map2 = Map(2 -> "b",3 -> "cc", 4 -> "e")

  val map3 = Map(
    1 -> TestData("a","b"),
    2 -> TestData("b","c"),
    3 -> TestData("c","d")
  )
  val map4 = Map(
    2 -> TestData("b","c"),
    3 -> TestData("cc","d"),
    4 -> TestData("e","f")
  )

  "MapDiff.diff" must "detect differences between the old and new value" in {
    {
      map1 -->? map2 should equal(Some(MapPatch(
        add = Map(4 -> "e"),
        remove = Set(1),
        change = Map(3 -> "cc")
      )))
      map1 -->? map1 should equal(None)
    }

    {
      map3 -->? map4 should equal(Some(MapPatch(
        add = Map(4 -> TestData("e","f")),
        remove = Set(1),
        change = Map(3 -> TestDataPatch(Some("cc"), None))
      )))
      map3 -->? map3 should equal(None)
    }
  }

  "MapDiff.patch" must "apply changes to an old value to achieve new value" in {
    val d = map1 -->? map2
    map1 |<-- d should equal(map2)
  }

}