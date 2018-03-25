package io.sw130.codility.lesson4

import org.scalatest.{FlatSpec, Matchers}

class FrogRiverOneSpec extends FlatSpec with Matchers {

  "FrogRiverOne" should "work" in {
    val array = Array.apply(1,3,1,4,2,3,5,4)
    FrogRiverOne.solution(5, array) shouldBe(6)
  }

  "FrogRiverOne" should "small" in {
    val array = Array.apply(1)
    FrogRiverOne.solution(1, array) shouldBe(0)
  }

  "FrogRiverOne" should "init" in {
    val array = Array.empty[Int]
    FrogRiverOne.solution(5, array) shouldBe(-1)
  }

  "FrogRiverOne" should "rare" in {
    val array = Array.apply(1,3,1,4,8,3,5,4)
    FrogRiverOne.solution(5, array) shouldBe(-1)
  }

}
