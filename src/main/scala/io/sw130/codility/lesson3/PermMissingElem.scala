package io.sw130.codility.lesson3

object PermMissingElem {
  //  def solution(a: Array[Int]): Int = {
  //    if(a.isEmpty) 0 else if(a.length == 1) a.head else {
  //      val sortedArray = a.sorted
  //      for (x <- a.indices) {
  //        val expected = sortedArray(x)-1
  //        if(expected != x)
  //          return (x+1)
  //      }
  //      0
  //    }
  //  }
  //-- optimise with formula n/2(1+n) -> n = length + 1) sum of the sequence
 def solution(a: Array[Int]): Int = {
   (((1 + (a.length + 1)).toLong * (a.length + 1) / 2)  - a.sum ).toInt
  }

}
