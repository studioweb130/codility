package io.sw130.codility.lesson4

import org.scalatest.{FlatSpec, Matchers}

class MaxCountersSpec extends FlatSpec with Matchers {

  "MaxCounters" should "calculate the values of counters after applying all alternating operations" in {
    val array = Array.apply(3,4,4,6,1,4,4)
    MaxCounters.solution2(5, array) shouldBe(Array.apply(3, 2, 2, 4, 2))
  }

}
