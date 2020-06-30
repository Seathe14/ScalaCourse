package Ex1;
class FunctionsTest extends org.scalatest.funsuite.AnyFunSuite {
  test("areaCircle calculates area correctly")
  {
    assert(Functions.areaCircle(5) == 5*5*Math.PI)
  }
  test("testCircle calling areaCircle calculates correctly")
  {
    assert(Functions.testCircle(5) == 5*5*Math.PI)
  }
  test("areaRectangleCurried calculating is correct")
  {
    assert(Functions.areaRectangleCurried(5)(6) == 30)
  }
  test("testRectangleCurried calculating correctly")
  {
    assert(Functions.testRectangleCurried(6,3) == 18)
  }
  test("areaRectangle calculating correctly")
  {
    assert(Functions.areaRectangle(6,6) == 36)
  }
  test("testRectangleUc calculating correctly")
  {
    assert(Functions.testRectangleUc(3,4) == 12)
  }
}
