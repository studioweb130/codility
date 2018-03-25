package io.sw130.codility.lesson4

import scala.annotation.tailrec

object PermCheck {
  def solution(a: Array[Int]): Int = {
    val sorted = a.sortBy(identity).toList
    @tailrec
    def permutation(lista: List[Int]): Int = {
      if (lista.tail.isEmpty) 1
      else if (lista.tail.head != lista.head + 1) 0
      else permutation(lista.tail)
    }
    if (sorted.head != 1) 0
    else if (sorted.last != sorted.size) 0
    else permutation(sorted)

  }

  def solution2(A: Array[Int]): Int = {
    val n = A.length
    val permBooleanArray = new Array[Boolean](n)
    for (x <- A) {
      if (x > n || permBooleanArray(x-1))
        return 0
      else
        permBooleanArray(x-1) = true
    }
    return 1
  }
}