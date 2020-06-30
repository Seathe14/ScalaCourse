package Ex3

import Ex3.Maps._
import org.scalatest.funsuite.AnyFunSuite
class MapsTest extends AnyFunSuite {
  val Frodo = User("Frodo",25)
  val Legolas = User("Elfs",700)
  val AnotherElf = User("Elfs",800)

  val map = Map("Frodo"->Frodo, "Elfs" ->Legolas, "Elfs" -> AnotherElf)
  val seq = Seq(Frodo,Legolas,AnotherElf)

  test("testGroupUsers groups users by name and calculates average age of a group")
  {
    assert(testGroupUsers(seq) == Map("Frodo" -> 25, "Elfs" ->750))
  }
  test("testNumberFrodos counts \"Adam\" count in passed map[String->User]") {
    assert(testNumberFrodos(Map("Frodo" -> Frodo, "Adam" -> User("Adam", 40))) == 1)
  }

  test("testUnderaged removes from the map all users under 35 years old") {
    assert(testUnderaged(map) == Map("Elfs" -> Legolas, "Elfs" -> AnotherElf))
  }
}
