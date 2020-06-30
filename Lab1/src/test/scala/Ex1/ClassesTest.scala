package Ex1

class ClassesTest extends org.scalatest.funsuite.AnyFunSuite {
  test("Animal.apply creates animal correctly")
  {
    assert(Animal.apply("cat") == (Some(Animal.first)))
    assert(Animal.apply("parrot") == (Some(Animal.second)))
    assert(Animal.apply("goldfish") == (Some(Animal.third)))
  }
  test("Animal.apply None if wrong parameter")
  {
    assert(Animal("something") == None)
  }
  test("knownAnimal returns true if contains")
  {
    assert(Animal.knownAnimal("cat"))
    assert(Animal.knownAnimal("parrot"))
    assert(Animal.knownAnimal("goldfish"))
  }
  test("knownAnimal if wrong parameter")
  {
    assert(!Animal.knownAnimal("snake"))
  }
  test("Animal.eats true if animal eats given food")
  {
    val goldfish = new Fishs("goldfish",Plants())
    assert(goldfish.eats(Plants().name))
    assert(!goldfish.eats(Vegetables().name))
  }
}
