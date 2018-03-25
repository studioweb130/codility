package io.sw130.codility.lesson4

object MissingInteger {

  def solution(a: Array[Int]): Int = {

    if(a.isEmpty)
      return 0
    else {
      val setArray = a.toSet
      for(i <- 0 until a.length) {
        if(!setArray.contains(i+1))
          return (i+1)
        else if(i == a.length -1)
          return a.length+1
      }
      return 0
    }
  }
}
