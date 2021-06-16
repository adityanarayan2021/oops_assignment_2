class Person(val name: String , val age:Int) extends Ordered[Person]
{
  def compare(that: Person): Int =
  {
    if (this.name == that.name)
    {
      println("If personOne Name is equal to personTwo Name, Compare Age of both")
      this.age - that.age
    }
    else
    {
      println("If Name is not equal.")
      this.name.length compare that.name.length
    }
  }
}
object PersonObject extends App
{
  var personOne = new Person("TestAgain", 25)
  var personTwo = new Person("Test", 24)
  println(personOne < personTwo)
  println(personOne > personTwo)
}