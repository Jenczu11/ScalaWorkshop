import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import org.scalatest.prop._
import org.scalatest.propspec.AnyPropSpec

import scala.collection.mutable._

class PropSpecTest extends AnyPropSpec with TableDrivenPropertyChecks with Matchers {
  // Table("column name", elements...)
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