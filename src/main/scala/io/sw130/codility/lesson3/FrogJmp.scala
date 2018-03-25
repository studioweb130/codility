package io.sw130.codility.lesson3

object FrogJmp {

  //-- roundUp
  def solution(x: Int, y: Int, d: Int): Int = {
    math.ceil((y - x).toDouble / d).toInt
  }

}
