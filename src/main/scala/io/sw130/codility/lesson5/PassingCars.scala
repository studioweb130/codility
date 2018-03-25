package io.sw130.codility.lesson5

object PassingCars {

  def solution(a: Array[Int]): Int = {

    def passCars(a: List[Int], acc: Int): Int = {
      a match {
        case head :: tail => {
          if(head == 0) {
            val newAcc = acc + tail.count(p => p == 1)
            passCars(tail, newAcc)
          } else {
            passCars(tail, acc)
          }
        }
        case Nil => {
          acc
        }
      }
    }
    passCars(a.toList, 0)
  }
}
