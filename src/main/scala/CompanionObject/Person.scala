package CompanionObject

class Person {
  var name: String = ""
  var age: Int = 0
  override def toString = s"$name, $age"
}

object Person {

  // a one-arg constructor
  def apply(name: String): Person = {
    val p = new Person
    p.name = name
    p
  }

  // a two-arg constructor
  def apply(name: String, age: Int): Person = {
    val p = new Person
    p.name = name
    p.age = age
    p
  }

  // de-constructor
  def unapply(p: Person): String = s"${p.name}, ${p.age}"

}