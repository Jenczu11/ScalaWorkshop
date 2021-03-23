package GraphicsCard

import org.scalatest._

class GraphicsCardFlatSpecTest extends FlatSpec {
  markup {
    """
      Tutaj definujemy FlatSpecTest dla shopu
      """
  }
  "An empty GraphicsCardShop" should "have 0 graphics Cards" in {
    val graphicsCardShop = new GraphicsCardShop()
    assert(graphicsCardShop.graphicsCardCount == 0)
  }

  val graphicsCardShop = new GraphicsCardShop()
  "GraphicsCardShop after restock" must "contain between 5 and 10 graphics cards" in {
    graphicsCardShop.restock()
    assert(graphicsCardShop.graphicsCardCount >= 5)
    assert(graphicsCardShop.graphicsCardCount <= 10)
  }
  they should "be able to buy one card" in {
    val graphicsCardCountBeforeBuying = graphicsCardShop.graphicsCardCount
    graphicsCardShop.gamersBuy()
    assert(graphicsCardCountBeforeBuying - 1 == graphicsCardShop.graphicsCardCount)
  }
}
