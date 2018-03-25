package io.sw130.codility.lesson4

import org.scalatest.{FlatSpec, Matchers}

class MissingIntegerSpec extends FlatSpec with Matchers {

  "MissingInteger" should "Find the smallest positive integer that does not occur in a given sequence for 1" in {
    val array = Array.apply(1, 3, 6, 4, 1, 2)
    MissingInteger.solution(array) shouldBe(5)
  }


  "MissingInteger" should "Find the smallest positive integer that does not occur in a given sequence for a smaller seq" in {
    val array = Array.apply(1, 2, 3)
    MissingInteger.solution(array) shouldBe(4)
  }
}
