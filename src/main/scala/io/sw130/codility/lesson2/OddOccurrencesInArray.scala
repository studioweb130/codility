package io.sw130.codility.lesson2

object OddOccurrencesInArray {

  def solution(a: Array[Int]): Int = {
    val size = a.size
    if (size < 1 || size > 1000000)
      throw new Exception("Invalid size")
    a.foldLeft(0) { (current, i) =>
      i.^(current) // XOR Binary
    }
  }

}
