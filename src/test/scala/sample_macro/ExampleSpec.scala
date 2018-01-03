package sample_macro

import org.specs2.mutable.Specification

class ExampleSpec extends Specification {

  "Example macro" should {
    "append Hello World" in {
      @Example val x: String = "Welcome and"
      x must be equalTo "Welcome and Hello World"
    }
  }

}
