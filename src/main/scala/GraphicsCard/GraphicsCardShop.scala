package GraphicsCard

class GraphicsCardShop {
  var emptyStock: Boolean = true
  var graphicsCardCount: Int = 0

  def restock() {
    emptyStock = false

    val min = 5
    val max = 10
    val rnd = new scala.util.Random
    graphicsCardCount = min + rnd.nextInt((max - min) + 1)
  }

  def gamersBuy() {
    if (!emptyStock && graphicsCardCount > 0) {
      graphicsCardCount -= 1
      if (graphicsCardCount > 0)
        emptyStock = false
      else
        emptyStock = true
    } else {
      throw new NoSuchElementException
    }
  }

  def scalpersBuy(): Unit = {
    emptyStock = true
    graphicsCardCount = 0
  }
}


