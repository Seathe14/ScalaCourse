package Ex2

import Ex2.RecursiveData._
import org.scalatest.funsuite.AnyFunSuite
class RecursiveDataTest extends AnyFunSuite {
  test("ListIntEmpty returns true if list is empty")
  {
    assert(ListIntEmpty(Nil) == true)
    assert(ListIntEmpty(List(1, 2, 3, 4)) == false)
  }
  test("testListIntEmpty returns true if list is empty")
  {
    assert(testListIntEmpty(Nil) == true)
    assert(testListIntEmpty(List(2,3,4)) == false)
  }
  test("ListIntHead returns first element of the list")
  {
    assert(ListIntHead(List(3,4,5)) == 3)
    assert(ListIntHead(Nil) == -1)
  }
  test("testListIntHead calls ListIntHead")
  {
    assert(testListIntHead(List(4,2,1)) == 4)
    assert(testListIntHead(Nil) == -1)
  }
  test("ListNotEmpty adds element to the list if it's empty")
  {
    assert(ListNotEmpty(2,Nil) == List(2))
    assert(ListNotEmpty(2,List(2,3,4)) == List(2,3,4))
  }
}
