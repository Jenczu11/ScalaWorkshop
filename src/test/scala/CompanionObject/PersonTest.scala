package CompanionObject

import org.scalatest.FunSuite

class PersonTest extends FunSuite {

  test("test apply and without apply") {
    val p = Person("Fred Flinstone")
    val p_apply = Person.apply("Fred Flinstone")
    assert(p.toString() === p_apply.toString())
  }

}
