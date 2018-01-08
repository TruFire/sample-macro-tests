package sample_macro

import org.scalatest.{FlatSpec, Matchers}

class ExampleScalaTestSpec extends FlatSpec with Matchers {

  "Example macro" should "not compile when applied to a def" in {
    """@Example def x: String = "a"""" shouldNot compile
    """@Example def x: String = "a"""" shouldNot typeCheck
  }

  it should "not compile when applied to a val that doesn't have an explicit type" in {
    """@Example val y = "Welcome and"""" shouldNot compile
    """@Example val y = "Welcome and"""" shouldNot typeCheck
  }

  it should "not compile when applied to a val of a non String type" in {
    """@Example val y: Int = 1""" shouldNot compile
    """@Example val y: Int = 1""" shouldNot typeCheck
  }

  it should "compile when applied to a String val" in {
    """@Example val x: String = "Welcome and"""" should compile
  }

}
