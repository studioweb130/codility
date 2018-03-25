package io.sw130.codility.lesson5

object CountDiv {

  def solution(a: Int, b: Int, k: Int): Int = {
    a.to(b).filter(p =>
      p % k == 0).size
  }

}
