package Ex4

import Ex4.TypeClasses._
import org.scalatest.funsuite.AnyFunSuite
class TypeClassesTest extends AnyFunSuite {
  test("testReversableString should return reversed string")
    {
      assert(testReversableString("reverse") == "esrever")
    }
  test("smash adds integers and multiplies doubles")
  {
    assert(smash(6, 5) == 11)
    assert(smash(2.5, 4.0) == 10.0)
    assert(smash("Concatenate", "String") == "ConcatenateString")
  }
  test("testSmashInt should add integer numbers")
  {
    assert(testSmashInt(2,4) == 6)
  }
  test("testSmashDouble multiplies doubles")
  {
    assert(testSmashDouble(2.5, 4.0) == 10.0)
  }
  test("testSmashString should concatenate strings")
  {
    assert(testSmashString("Concatenate", "String") == "ConcatenateString")

  }
}
