package Calculators

class FactorialCalculatorTest extends PropCustomTest {
  val examples = Table(
    ("Input", "Result"),
    (0, 1),
    (1, 1),
    (2, 2),
    (3, 6),
    (4, 24),
    (5, 120)
  )

  property("factorial property") {
    forAll(examples) { (Input: Int, Result: Int) =>
      val calc = new FactorialCalculator()
      info("----------------")
      Given("input " + Input)
      When("factorial")
      Then("result should equal " + Result)
      assert(calc.factorial(Input) === Result)
    }
  }
}
