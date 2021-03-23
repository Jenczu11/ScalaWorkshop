package GraphicsCard

import org.scalatest.FunSuite

class GraphicsCardFunSuiteTest extends FunSuite {

  test("A GraphicsShop should have 0 cards on init") {
    val graphicsCardShop = new GraphicsCardShop()
    assert(graphicsCardShop.graphicsCardCount === 0)
  }

  test("Invoking gamersBuy on empty shop should produce NoSuchElementException") {
    val graphicsCardShop = new GraphicsCardShop()
    assertThrows[NoSuchElementException] {
      graphicsCardShop.gamersBuy()
    }
  }
  test("A GraphicsShop on restock should have 5-10 GPUs") {
    val graphicsCardShop = new GraphicsCardShop()
    assert(graphicsCardShop.graphicsCardCount === 0)

    graphicsCardShop.restock()
    assert(graphicsCardShop.graphicsCardCount >= 5)
    assert(graphicsCardShop.graphicsCardCount <= 10)
  }
}
