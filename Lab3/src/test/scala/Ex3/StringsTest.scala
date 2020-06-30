package Ex3

import Ex3.Strings._
import org.scalatest.funsuite.AnyFunSuite
class StringsTest extends AnyFunSuite {
  test("testUppercase returns string with capital letters")
  {
    assert(testUppercase("thesewillbecapitals") == "THESEWILLBECAPITALS")
  }
  test("testInterpolation inserts given name and age into string")
  {
    assert(testInterpolations("Valery",19) == "Hi, my name is Valery and I am 19 years old.")
  }
  test("testComputation inserts numbers into string")
  {
    assert(testComputation(3,6) == "Hi,\n" +
      "now follows a quite hard calculation. We try to add:\n" +
      s"  a := 3\n" +
      s"  b := 6\n\n" +
      s"  return 3 + 6")
  }
  test("testTakeTwo takes first two characters of the string")
  {
    assert(testTakeTwo("Substring") == "Su")
  }
}
