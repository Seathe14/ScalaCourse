package Ex3

import Ex3.Sequence._
import org.scalatest.funsuite.AnyFunSuite
class SequenceTest extends AnyFunSuite {
  test("testLastElement returns last elements of the sequence")
  {
    assert(testLastElement(Seq(3,4,5,6)) == Some(6))
  }
  test("testZip zips combines two sequences") {
    assert(testZip(Seq(3, 4), Seq(2, 1)) == Seq((3, 2), (4, 1)))
  }
  test("testForAll checks condition for all elements") {
    assert(testForAll(Seq(1, 2, 3, 4))((x: Int) => x < 4) == false)
    assert(testForAll(Seq(1, 2, 3, 4,5))((x: Int) => x < 6) == true)
  }
  test("testPalindrom returns true if sequence is palindrom and false otherwise") {
    assert(testPalindrom(Seq(1, 2, 3, 4)) == false)
    assert(testPalindrom(Seq(1, 3, 4, 3, 1)) == true)
  }
  test("testFlatMap should apply function to each element of the sequence") {
    assert(testFlatMap(Seq(1, 2, 3, 4,5))((x: Int) => Seq.range(1, x)) == Seq(1, 1, 2, 1, 2, 3,1,2,3,4))
  }
}
