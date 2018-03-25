package io.sw130.codility.lesson2

object CyclicRotation {

  def solution(A: Array[Int], K: Int): Array[Int] = {
    if (null == A || A.size == 0) A else (A drop A.size - (K % A.size)) ++ (A take A.size - (K % A.size))
  }

  def solution2(A: Array[Int], K: Int): Array[Int] = {
    def rotateKStep(l: List[Int], K: Int): List[Int] = {
      def rotateOneStep(l: List[Int]) = {
        l.take(l.size - 1).+:(l.last)
      }

      if (K == 0) l
      else rotateKStep(rotateOneStep(l), K - 1)
    }
    if (A.isEmpty) A
    else rotateKStep(A.toList, K).toArray
  }
}
