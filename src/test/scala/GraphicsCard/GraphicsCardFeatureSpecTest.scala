package GraphicsCard

import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec

class GraphicsCardFeatureSpecTest extends AnyFeatureSpec with GivenWhenThen {

  info("As a gamer I want to buy graphics card")

  Feature("No graphics cards") {
    Scenario("User tries to buy graphics card when stock is empty") {

      Given("An empty stock")
      val graphicsCardShop = new GraphicsCardShop()
      assert(graphicsCardShop.emptyStock)

      When("user wants to buy a graphics card")
      Then("function should throw [NoSuchElementException]")
      assertThrows[NoSuchElementException] {
        graphicsCardShop.gamersBuy()
      }
      And("Stock is still empty")
      assert(graphicsCardShop.emptyStock)
    }
  }
}
