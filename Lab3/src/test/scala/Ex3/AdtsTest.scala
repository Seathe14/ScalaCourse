package Ex3

import Ex3.Adts._
import org.scalatest.funsuite.AnyFunSuite
class AdtsTest extends AnyFunSuite {
  test("testGetNth should return n-th element of the list ")
  {
    assert(testGetNth(List(3,4,5,6),2) == Some(5))
  }
  test("Double should return double number")
  {
    assert(Double(Some(4)) == Some(8))
    assert(Double(None) == None)
  }
  test("testDouble should return double number")
  {
    assert(testDouble(Some(4)) == Some(8))
    assert(testDouble(None) == None)
  }
  test("IsEven should return passed number if it's even and string otherwise ")
  {
    assert(IsEven(4) == Right(4))
    assert(IsEven(3) == Left("Нечетное число"))
  }
  test("testIsEven calls IsEven")
  {
    assert(testIsEven(4) == Right(4))
    assert(testIsEven(3) == Left("Нечетное число"))
  }
  test("SafeDivide checks if divisor is not 0")
  {
    assert(SafeDivide(16,2) == Right(8))
    assert(SafeDivide(12,0) == Left("Вы не можете делить на ноль"))
  }
  test("testSafeDivide checks if divisor is not 0")
  {
    assert(testSafeDivide(16,2) == Right(8))
    assert(testSafeDivide(12,0) == Left("Вы не можете делить на ноль"))
  }
  def impureFunc(str: String): Int = {
    2/0
  }

  def pureFunc(str: String): Int = {
    2
  }

  test("GoodOldJava should return Try[Int]") {
    assert(GoodOldJava(impureFunc, "Hello, world!") != util.Success(2))
  }

  test("testGoodOldJava should return Try[Int]") {
    assert(testGoodOldJava(pureFunc, "Hello, world!") == util.Success(2))
  }
}
