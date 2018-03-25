package io.sw130.codility.lesson4

import org.scalatest.{FlatSpec, Matchers}

class PermCheckSpec extends FlatSpec with Matchers {

  "PermCheckSpec" should "check whether array A is a permutation." in {
    val array = Array.apply(5, 4, 1, 3, 2)
    PermCheck.solution2(array) shouldBe(1)
  }

}
