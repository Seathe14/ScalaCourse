package Ex2

import org.scalatest.funsuite.AnyFunSuite

class CompositionsTest extends AnyFunSuite {
  test("testCompose composes given functions")
  {
    assert(Compositions.testCompose((i:Int) => "Hello" * i)((i: String) => i * 2)((i:String) => i.dropRight(2))(2) == "HelloHelloHelloHel")
  }
  test("testFlatMap composes functions")
  {
    assert(Compositions.testMapFlatMap((i:Int) => if (i > 0) Some(i) else None)
    ((i:Int) => if (i > 10) Some(i) else None)
    ((i:Int) => i * 2)(Some(15)) == Some(30))
    assert(Compositions.testMapFlatMap((i:Int) => if (i > 0) Some(i) else None)
    ((i:Int) => if (i > 10) Some(i) else None)
    ((i:Int) => i * 2)(Some(5)) == None)
  }
  test("testForComprehension composes functions")
  {
    assert(Compositions.testForComprehension((i:Int) => if (i > 0) Some(i) else None)
    ((i:Int) => if (i > 10) Some(i) else None)
    ((i:Int) => i * 2)(Some(11)) == Some(22))
  }
}
