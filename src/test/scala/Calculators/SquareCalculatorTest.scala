package Calculators

import org.scalatest.matchers.should.Matchers.{convertToAnyShouldWrapper, equal}

class SquareCalculatorTest extends PropCustomTest {

  val examples = Table(("Input","Result"),(1,1),(2,4),(3,9))

  property("square property") {
    forAll(examples) { (Input: Int, Result: Int) =>
      val calc = new SquareCalculator()
      info("----------------")
      Given("input " + Input)
      When("squared")
      Then("result should equal " + Result)
      assert(calc.square(Input) === Result)
      calc.square(Input) should equal (Result)
    }
  }

}
