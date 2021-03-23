package GraphicsCard

import org.scalatest._
import prop._
import scala.collection.mutable._

class PropSpecTest extends PropSpec with TableDrivenPropertyChecks with Matchers {
  // Table("columnname", elements...)
  var examples = Table("set",  BitSet.empty, LinkedHashSet.empty[Int], HashSet.empty[Int])

  property("an empty Set should have size 0") {
    forAll(examples) { set =>
      println(set)
      set.size should be (0)
    }
  }

  property("invoking head on an empty set should produce NoSuchElementException") {
    forAll(examples) { set =>
      a [NoSuchElementException] should be thrownBy { set.head }
    }
  }
}