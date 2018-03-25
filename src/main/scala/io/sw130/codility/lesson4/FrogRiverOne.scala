package io.sw130.codility.lesson4

object FrogRiverOne {

  def solution(x: Int, a: Array[Int]): Int = {
    if(a.isEmpty)
      return -1
    else if(a.size == 1) {
      if(a(0) == 1)
        return 0
      else
        return -1
    } else {
      val flagArrays = new Array[Boolean](x)
      for (i <- 0 until a.length) {
        if (!flagArrays.contains(false))
          return (i-1)
        else {
          if(a(i)-1 < x)
            flagArrays(a(i)-1) = true
        }
      }
      return -1
    }
  }
}
