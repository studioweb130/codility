package io.sw130.codility.lesson5

import org.scalatest.{FlatSpec, Matchers}

class PassingCarsSpec extends FlatSpec with Matchers {

  "PassingCars" should "Count the number of passing cars on the road" in {
    val a: Array[Int] = Array.apply(0,1,0,1,1)
    PassingCars.solution(a) shouldBe(5)
  }

}
