package Calculators

import org.scalatest.matchers.should.Matchers.{convertToAnyShouldWrapper, equal}
import org.scalatest.prop.TableFor2

class SquareCalculatorTest extends PropCustomTest {

  val examples: TableFor2[Int, Int] = Table(
    ("Input","Result"),
    (1,1),
    (2,4),
    (3,9)
  )

  property("square property") {
    forAll(examples) { (Input: Int, Result: Int) =>
      val calc = new SquareCalculator()
      info("----------------")
      Given("input " + Input)
      When("squared")
      Then("result should equal " + Result)
//      You can go with classic assert or smth should equal (this)
//      assert(calc.square(Input) === Result)
      calc.square(Input) should equal (Result)
    }
  }

}
