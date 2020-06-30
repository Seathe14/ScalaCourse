package Ex1

import org.scalatest.funsuite.AnyFunSuite

class PatternMatchingTest extends AnyFunSuite {
  test("IntToString correct")
  {
    assert(PatternMatching.IntToString(1) == "it is one")
    assert(PatternMatching.IntToString(2) == "it is two")
    assert(PatternMatching.IntToString(3) == "it is three")
    assert(PatternMatching.IntToString(1761) == "what's that")
  }

  test("testIntToString calls IntToString with given parameters")
  {
    assert(PatternMatching.testIntToString(1) == "it is one")
    assert(PatternMatching.testIntToString(2) == "it is two")
    assert(PatternMatching.testIntToString(3) == "it is three")
    assert(PatternMatching.testIntToString(1761) == "what's that")
  }

  test("isMaxAndMoritz M(max) M(moritz)")
  {
    assert(PatternMatching.IsMaxAndMoritz("max"))
    assert(PatternMatching.IsMaxAndMoritz("Max"))
    assert(PatternMatching.IsMaxAndMoritz("moritz"))
    assert(PatternMatching.IsMaxAndMoritz("Moritz"))

    assert(!PatternMatching.IsMaxAndMoritz("something"))
  }

  test("testIsMaxAndMoritz the same result as before")
  {
    assert(PatternMatching.testIsMaxAndMoritz("max"))
    assert(PatternMatching.testIsMaxAndMoritz("Max"))
    assert(PatternMatching.testIsMaxAndMoritz("moritz"))
    assert(PatternMatching.testIsMaxAndMoritz("Moritz"))

    assert(!PatternMatching.testIsMaxAndMoritz("something"))
  }
  test("IsEven checks if the value is even")
  {
    assert(PatternMatching.IsEven(6))
  }
  test("testIsEven checks if the value is even")
  {
    assert(PatternMatching.testIsEven(6))
  }
  test("winsA rock-paper-scissor result for first player")
  {
    assert(PatternMatching.WinsA(PatternMatching.Rock,PatternMatching.Scissor) == PatternMatching.Win)
    assert(PatternMatching.WinsA(PatternMatching.Rock,PatternMatching.Rock) == PatternMatching.Draw)
    assert(PatternMatching.WinsA(PatternMatching.Rock,PatternMatching.Paper) == PatternMatching.Lose)

    assert(PatternMatching.WinsA(PatternMatching.Paper,PatternMatching.Rock) == PatternMatching.Win)
    assert(PatternMatching.WinsA(PatternMatching.Paper,PatternMatching.Paper) == PatternMatching.Draw)
    assert(PatternMatching.WinsA(PatternMatching.Paper,PatternMatching.Scissor) == PatternMatching.Lose)

    assert(PatternMatching.WinsA(PatternMatching.Scissor,PatternMatching.Paper) == PatternMatching.Win)
    assert(PatternMatching.WinsA(PatternMatching.Scissor,PatternMatching.Scissor) == PatternMatching.Draw)
    assert(PatternMatching.WinsA(PatternMatching.Scissor,PatternMatching.Rock) == PatternMatching.Lose)
  }

  test("testWinsA rock-paper-scissor result for first player")
  {
    assert(PatternMatching.testWinsA(PatternMatching.Rock,PatternMatching.Scissor) == PatternMatching.Win)
    assert(PatternMatching.testWinsA(PatternMatching.Rock,PatternMatching.Rock) == PatternMatching.Draw)
    assert(PatternMatching.testWinsA(PatternMatching.Rock,PatternMatching.Paper) == PatternMatching.Lose)

    assert(PatternMatching.testWinsA(PatternMatching.Paper,PatternMatching.Rock) == PatternMatching.Win)
    assert(PatternMatching.testWinsA(PatternMatching.Paper,PatternMatching.Paper) == PatternMatching.Draw)
    assert(PatternMatching.testWinsA(PatternMatching.Paper,PatternMatching.Scissor) == PatternMatching.Lose)

    assert(PatternMatching.testWinsA(PatternMatching.Scissor,PatternMatching.Paper) == PatternMatching.Win)
    assert(PatternMatching.testWinsA(PatternMatching.Scissor,PatternMatching.Scissor) == PatternMatching.Draw)
    assert(PatternMatching.testWinsA(PatternMatching.Scissor,PatternMatching.Rock) == PatternMatching.Lose)
  }

  test("extractMammalWeight returns mammal weight")
  {
    val mammal = PatternMatching.Mammal("cat",PatternMatching.Meat,7)
    assert(PatternMatching.ExtractMammalWeight(mammal) == 7)
    assert(PatternMatching.ExtractMammalWeight(PatternMatching.Fish("goldfish",PatternMatching.Plants)) == -1)
  }
  test("testExtractMammalWeight returns mammal weight")
  {
    assert(PatternMatching.testExtractMammalWeight(PatternMatching.Mammal("cat",PatternMatching.Meat,7)) == 7)
    assert(PatternMatching.testExtractMammalWeight(PatternMatching.Fish("goldfish",PatternMatching.Plants)) == -1)
  }
  test("updateFood changes food")
  {
    val fish = PatternMatching.Fish("goldfish",PatternMatching.Plants)
    val bird = PatternMatching.Bird("parrot", PatternMatching.Vegetables)
    PatternMatching.UpdateFood(bird)
    PatternMatching.UpdateFood(fish)
    assert(bird.food  == PatternMatching.Plants)
    assert(fish.food == PatternMatching.Plants)
  }
  test("testUpdateFood calls updateFood")
  {
    val bird = PatternMatching.Bird("parrot", PatternMatching.Vegetables)
    PatternMatching.testUpdateFood(bird)
    assert(bird.food  == PatternMatching.Plants)
  }
}
