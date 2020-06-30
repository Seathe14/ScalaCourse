package Ex1

//import Animal.{first, knownAnimal}
//package exercise1





trait Food
{
  val name: String
}
case class Meat() extends Food
{
  val name = "meat"
}
case class Vegetables() extends Food
{
  val name = "vegetables"
}
case class Plants() extends Food
{
  val name = "plants"
}

//object Food
//{
//  def apply(food: String): Option[Food] =
//  {
//    food match
//    {
//      case "meat" => Some(Meat())
//      case "vegetables" => Some(Vegetables())
//      case "plants" => Some(Plants())
//      case default => None
//    }
//  }
//}
trait Animal
{
  val name: String
  val food: Food
  def eats(food: String): Boolean =
  {
    if (this.food.name == food) true else false
  }

}
case class Mammals(val name: String,val food: Food) extends Animal
case class Birds(val name: String,val food: Food) extends Animal
case class Fishs(val name: String,val food: Food) extends Animal

object Animal
{
  val first = Mammals("cat", Meat())
  val second = Birds("parrot", Vegetables())
  val third = Fishs("goldfish",Plants())

  def knownAnimal(name: String): Boolean =
    {
      if(name == first.name || name == second.name || name == third.name) true else false
    }
  def apply(name: String): Option[Animal] =
  {
     name match {
       case "cat" => Some(first)
       case "parrot" => Some(second)
       case "goldfish" => Some(third)
       case default => None
     }
  }
}



