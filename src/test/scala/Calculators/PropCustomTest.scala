package Calculators

import org.scalatest.{GivenWhenThen}
import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.propspec.AnyPropSpec

abstract class PropCustomTest extends AnyPropSpec with TableDrivenPropertyChecks with GivenWhenThen {

}
