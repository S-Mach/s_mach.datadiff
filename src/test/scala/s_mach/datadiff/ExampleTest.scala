package s_mach.datadiff

import org.scalatest.{Matchers, FlatSpec}

object ExampleTest {
  case class Name(
    first: String,
    middle: Option[String],
    last: String
  )

  case class NamePatch(
    first: StringPatch,
    middle: OptionPatch[String, StringPatch],
    last: StringPatch
  )

  object Name {
    implicit val dataDiff_Name = DataDiff.forProductType[Name,NamePatch]
  }

  case class Person(
    name: Name,
    age: Int
  )

  case class PersonPatch(
    name: NamePatch,
    age: IntPatch
  )

  object Person {
    implicit val dataDiff_Person = DataDiff.forProductType[Person,PersonPatch]
  }

  val p1 = Person(Name("Gary",None,"Oldman"),56)
  val p2 = Person(Name("Gary",Some("Freakn'"),"Oldman"),57)

}

class ExampleTest extends FlatSpec with Matchers {


}
