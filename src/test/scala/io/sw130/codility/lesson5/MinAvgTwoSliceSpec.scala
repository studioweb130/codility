package io.sw130.codility.lesson5

import org.scalatest.{FlatSpec, Matchers}

class MinAvgTwoSliceSpec extends FlatSpec with Matchers {

  "MinAvgTwoSlice" should "Find the minimal average of any slice containing at least two elements." in {
    val a: Array[Int] = Array.apply(4,2,2,5,1,5,8)
    MinavgTwoSlice.solution(a) shouldBe(1)
  }

}
