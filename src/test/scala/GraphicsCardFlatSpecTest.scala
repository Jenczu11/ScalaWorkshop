import GraphicsCard.GraphicsCardShop
import org.scalatest._

class GraphicsCardFlatSpecTest extends FlatSpec {
  "An empty GraphicsCardShop" should "have 0 graphics Cards" in {
    val graphicsCardShop = new GraphicsCardShop()
    assert(graphicsCardShop.graphicsCardCount == 0)
  }

  "GraphicsCardShop after restock" should "contain between 5 and 10 graphics cards" in {
    val graphicsCardShop = new GraphicsCardShop()
    graphicsCardShop.restock()
    assert(graphicsCardShop.graphicsCardCount >= 5)
    assert(graphicsCardShop.graphicsCardCount <= 10)
  }
}
