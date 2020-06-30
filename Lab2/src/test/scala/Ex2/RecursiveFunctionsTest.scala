package Ex2

import Ex2.RecursiveFunctions._
import org.scalatest.funsuite.AnyFunSuite
class RecursiveFunctionsTest extends AnyFunSuite {
  test("length of the list")
  {
    assert(length(List(1,2,3,4,5)) == 5)
  }
  test("reverse reverses list")
  {
    assert(reverse(List(3,4,5)) == List(5,4,3))
  }
  test("testReverse reverses list")
  {
    assert(testReverse(List(5,6,7,4)) == List(4,7,6,5))
  }
  test("Map should apply given function to each element of the passed list")
  {
    assert(Map(List(1,2,3,4,5))((x:Int)=>x*2) == List(2,4,6,8,10))
  }
  test("testMap should apply given function to each element of the passed list")
  {
    assert(testMap(List(2,3,4),(x:Int) => x*2) == List(4,6,8))
  }
  test("Append concatenates two lists")
  {
    assert(Append(List(2,3,4),List(5,6,8)) == List(2,3,4,5,6,8))
  }
  test("testAppend concatenates two lists")
  {
    assert(testAppend(List(4,5,6),List(1,2,3)) == List(4,5,6,1,2,3))
  }
  test("FlatMap applies given function to each elements")
  {
    assert(FlatMap(List(2,3,4,6))((x:Int)=>List.range(1,x)) == List(1,1,2,1,2,3,1,2,3,4,5))
  }
  test("testFlatMap applies given function to each elements")
  {
    assert(testFlatMap(List(2,3,4,6),(x:Int)=>List.range(1,x)) == List(1,1,2,1,2,3,1,2,3,4,5))
  }
}
