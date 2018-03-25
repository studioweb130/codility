package io.sw130.codility.lesson5

object MinavgTwoSlice {

  def solution(a: Array[Int]): Int = {

    var min: Double = 1000000000d

    for (i <- 0 to a.length-2)
      min = math.min(min, (a(i)+a(i+1))/2.0)

    for (i <- 0 to a.length-3)
      min = math.min(min, (a(i)+a(i+1)+a(i+2))/3.0)

    for (i <- 0 to a.length-2){
      if ((a(i)+a(i+1))/2.0 == min)
        return i
      if (i < a.length-2 && ((a(i)+a(i+1)+a(i+2))/3.0 == min))
        return i
    }
    return -100
  }

}
