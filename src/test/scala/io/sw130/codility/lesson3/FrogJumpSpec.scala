package io.sw130.codility.lesson3

import org.scalatest.{FlatSpec, Matchers}

class FrogJumpSpec extends FlatSpec with Matchers {

  "FrogJump" should "Count minimal number of jumps from position X to Y" in {
    FrogJmp.solution(10, 85, 30) shouldBe(3)
  }


}
