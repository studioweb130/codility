package io.sw130.codility.lesson1

import org.scalatest.{FlatSpec, Matchers}

class BinaryGapSpec extends FlatSpec with Matchers {


  "Solution" should "Find longest sequence of zeros in binary representation of an integer for 15" in {
    BinaryGap.solution(15) shouldBe(0)
  }

  "Solution" should "Find longest sequence of zeros in binary representation of an integer for 0" in {
    BinaryGap.solution(0) shouldBe(0)
  }

  "Solution" should "Find longest sequence of zeros in binary representation of an integer for 1" in {
    BinaryGap.solution(1) shouldBe(0)
  }

  "Solution" should "Find longest sequence of zeros in binary representation of an integer for 9" in {
    BinaryGap.solution(9) shouldBe(2)
  }

  "Solution" should "Find longest sequence of zeros in binary representation of an integer for 20" in {
    BinaryGap.solution(20) shouldBe(1)
  }

  "Solution" should "Find longest sequence of zeros in binary representation of an integer for 529" in {
    BinaryGap.solution(529) shouldBe(4)
  }

  "Solution" should "Find longest sequence of zeros in binary representation of an integer for 1041" in {
    BinaryGap.solution(1041) shouldBe(5)
  }


  "Solution" should "Find longest sequence of zeros in binary representation of an integer for clean 0 right" in {
    BinaryGap.cleanZeros("000001010101001001000000") shouldBe("1010101001001")
  }

}
