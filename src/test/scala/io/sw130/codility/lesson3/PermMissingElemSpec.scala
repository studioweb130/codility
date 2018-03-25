package io.sw130.codility.lesson3

import org.scalatest.{FlatSpec, Matchers}

class PermMissingElemSpec extends FlatSpec with Matchers {

  "PermMissingElem" should "Find the missing element in a given permutation" in {
    val a = Array.apply(2, 3, 1, 5)
    PermMissingElem.solution(a) shouldBe(4)
  }


  "PermMissingElem" should "Find the missing element in a given permutation - empty" in {
    val a = Array.empty[Int]
    PermMissingElem.solution(a) shouldBe(0)
  }


  "PermMissingElem" should "Find the missing element in a given permutation - single" in {
    val a = Array.apply(1)
    PermMissingElem.solution(a) shouldBe(1)
  }


  "PermMissingElem" should "Find the missing element in a given permutation missing first" in {
    val a = Array.apply(2, 3, 4, 5)
    PermMissingElem.solution(a) shouldBe(1)
  }


  "PermMissingElem" should "Find the missing element in a given permutation missing last" in {
    val a = Array.apply(1, 2, 3, 5)
    PermMissingElem.solution(a) shouldBe(4)
  }

  "PermMissingElem" should "Find the missing element in a given permutation double" in {
    val a = Array.apply(1,3)
    PermMissingElem.solution(a) shouldBe(2)
    val b = Array.apply(1,2)
    PermMissingElem.solution(b) shouldBe(0)
    val c = Array.apply(3,1)
    PermMissingElem.solution(c) shouldBe(2)
  }

}
