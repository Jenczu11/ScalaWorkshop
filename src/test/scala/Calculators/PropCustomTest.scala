package Calculators

import org.scalatest.{GivenWhenThen, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks

abstract class PropCustomTest extends PropSpec with TableDrivenPropertyChecks with GivenWhenThen {

}
