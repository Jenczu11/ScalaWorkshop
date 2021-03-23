package GraphicsCard

import org.scalatest.freespec.AnyFreeSpec

class GraphicsCardFreeSpecTest extends AnyFreeSpec {
  val graphicsCardShop = new GraphicsCardShop()

  "A GraphicsCardShop" - {
    "when after restock" - {
      graphicsCardShop.restock()
      "should contain between 5 and 10 graphics cards" in {
        assert(graphicsCardShop.graphicsCardCount >= 5)
        assert(graphicsCardShop.graphicsCardCount <= 10)
      }
      "when gamer wants to buy a graphics card" - {
        "it should be possible now" in {
          val graphicsCardCountBeforeBuying = graphicsCardShop.graphicsCardCount
          graphicsCardShop.gamersBuy()
          assert(graphicsCardCountBeforeBuying - 1 == graphicsCardShop.graphicsCardCount)
        }
      }
    }
  }
}
