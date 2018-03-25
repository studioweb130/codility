package io.sw130.codility.lesson3

import org.scalatest.{FlatSpec, Matchers}

class TapeEquilibriumSpec extends FlatSpec with Matchers {

  "TapeEquilibrium" should "Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|" in {

    val array: Array[Int] = Array.apply(3, 1, 2, 4 , 3)

    TapeEquilibrium.solution(array) shouldBe(1)
  }


}
