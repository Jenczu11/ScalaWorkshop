package Calculators

class FactorialCalculator {
  def factorial(n: Int): Int = {
    var f = 1
    for (i <- 1 to n) {
      f = f * i
    }
    f
  }
}
