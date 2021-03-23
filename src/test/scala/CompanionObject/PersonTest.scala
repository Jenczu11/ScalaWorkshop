package CompanionObject

import org.scalatest.funsuite.AnyFunSuite

class PersonTest extends AnyFunSuite {

  test("test apply and without apply") {
    val p = Person("Fred Flinstone")
    val p_apply = Person.apply("Fred Flinstone")
    assert(p.toString() === p_apply.toString())
  }

}
