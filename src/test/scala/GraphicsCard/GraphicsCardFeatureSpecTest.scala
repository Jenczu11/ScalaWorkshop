package GraphicsCard

import org.scalatest.{FeatureSpec, _}

class GraphicsCardFeatureSpecTest extends FeatureSpec with GivenWhenThen {

  info("As a gamer I want to buy graphics card")

  feature("No graphics cards") {
    scenario("User tries to buy graphics card when stock is empty") {

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
