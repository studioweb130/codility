package io.sw130.codility.lesson3

object TapeEquilibrium {

  def solution(a: Array[Int]): Int = {
    val total = a.sum
    var left = a.head
    var min = math.abs(left - (total - left))
    for (i <- 1 until a.size - 1) {
      left = left + a(i)
      val dif = math.abs((total - left) - left)
      if (dif < min)
        min = dif
    }
    min
  }
}
