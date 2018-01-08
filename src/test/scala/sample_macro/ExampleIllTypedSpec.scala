package sample_macro

import org.specs2.mutable.Specification
import shapeless.test.illTyped

class ExampleIllTypedSpec extends Specification {

  "Example macro" should {

    "Give a compiler error when applied to a def" in {
      illTyped(
        "@Example def x: String = \"Welcome and\"",
        "@Example can only be used with val of type String"
      )
      ok
    }

    "Give a compiler error when applied to a val that doesn't have an explicit type" in {
      illTyped(
        "@Example val y = \"Welcome and\"",
        "y must have an explicit type"
      )
      ok
    }

    "Give a compiler error when applied to a val of a non String type" in {
      illTyped(
        "@Example val y: Int = 1",
        "y must be of type String, not Int"
      )
      ok
    }

  }
}
