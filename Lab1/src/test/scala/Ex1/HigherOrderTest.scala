package Ex1

import org.scalatest.funsuite.AnyFunSuite

class HigherOrderTest extends AnyFunSuite {
  test("nTimes returns n*f(a,b)")
  {
    assert(HigherOrder.nTimes(HigherOrder.plus,5,3,2) == 16)
    assert(HigherOrder.nTimes(HigherOrder.multiply,5,3,2) == 30)
    assert(HigherOrder.nTimes((a:Int,b:Int) => a-b,5,3,15)==30)
  }
  test("testNTimes calls nTimes")
  {
    assert(HigherOrder.testNTimes((a:Int,b:Int) => a-b,5,3,15)==30)
  }
  test("testAnonymousNTime with given parameters (a>b)*c")
  {
    assert(HigherOrder.testAnonymousNTimes(6,5,10) == 60)
    assert(HigherOrder.testAnonymousNTimes(5,6,10) == 60)

  }
}
