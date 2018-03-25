package io.sw130.codility.lesson4

import scala.annotation.tailrec

object MaxCounters {

  def solution(n: Int, a: Array[Int]): Array[Int] = {
    val initList: List[Int] = 1.to(n).map(x=> 0).toList

    @tailrec
    def iterateList(lista: List[Int], id: Int, max: Int): List[Int] = {
      if(id != a.length && a(id) > n) {
        val maxList: List[Int] = 0.to(n-1).map(x=> max).toList
        iterateList(maxList, (id + 1), max)
      } else if(id != a.length) {
        val listas = lista.splitAt(a(id)-1)
        val newMax = listas._2.head + 1
        if(newMax > max)
          iterateList((listas._1 ++ List(listas._2.head + 1) ++ listas._2.tail), (id + 1), newMax)
        else
          iterateList((listas._1 ++ List(listas._2.head + 1) ++ listas._2.tail), (id + 1), max)
      } else {
        lista
      }
    }
    iterateList(initList, 0, 0).toArray
  }


  def solution2(n: Int, a: Array[Int]): Array[Int] = {
    val counters: Array[Int] = Array.ofDim(n)

    def increaseCounter(x: Int) = counters(x - 1) = counters(x - 1) + 1

    def maxCounters() = {
      val max = counters.max
      for (i <- counters.indices) counters(i) = max
    }

    def getCounters(ops: List[Int]): Array[Int] = {
      if (ops.isEmpty)
        counters
      else {
        ops.head match {
          case x: Int if x >= 1 && x <= n => increaseCounter(x)
          case x: Int if x > n => maxCounters()
        }
        getCounters(ops.tail)
      }
    }

    getCounters(a.toList)
  }
}
