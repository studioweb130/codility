package io.sw130.codility.lesson2

import org.scalatest.{FlatSpec, Matchers}

class OddOccurrencesInArraySpec extends FlatSpec with Matchers {


  "OddOccurrencesInArray" should "Find value that occurs in odd number of elements 15" in {

    val array: Array[Int] = Array.apply(9, 3, 9, 3, 9, 7, 9)

    OddOccurrencesInArray.solution(array) shouldBe(7)
  }


  "OddOccurrencesInArray" should "Find value that occurs in odd number of elements 42" in {

    val array: Array[Int] = Array.apply(42)

    OddOccurrencesInArray.solution(array) shouldBe(42)
  }

  "OddOccurrencesInArray" should "Find value that occurs in odd number of elements 412" in {

    val array: Array[Int] = Array.apply(42, 43, 43)

    OddOccurrencesInArray.solution(array) shouldBe(42)
  }

  "OddOccurrencesInArray" should "Find value that occurs in odd number of elements 421" in {

    val array: Array[Int] = Array.apply(43, 42, 43)

    OddOccurrencesInArray.solution(array) shouldBe(42)
  }

  "OddOccurrencesInArray" should "Find value that occurs in odd number of elements 432" in {

    val array: Array[Int] = Array.apply(43, 43, 42)

    OddOccurrencesInArray.solution(array) shouldBe(42)
  }

}
