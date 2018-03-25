package io.sw130.codility.lesson5

import org.scalatest.{FlatSpec, Matchers}

class CountDivSpec extends FlatSpec with Matchers {

  "CountDiv" should "Compute number of integers divisible by k in range (6,11,2)" in {
    CountDiv.solution(6,11,2) shouldBe(3)
  }

  "CountDiv" should "Compute number of integers divisible by k in range (6,33, 11)" in {
    CountDiv.solution(6,33,11) shouldBe(3)
  }

  "CountDiv" should "Compute number of integers divisible by k in range (6,13,13)" in {
    CountDiv.solution(6,13,13) shouldBe(1)
  }

}
