package io.sw130.codility.lesson1

import scala.annotation.tailrec

object BinaryGap {

  def solution(n: Int): Int = {
    val binaryString: String = cleanZeros(n.toBinaryString)
    if(binaryString.equalsIgnoreCase("0") || !binaryString.contains("0")) {
      0
    } else {
      val chunks = binaryString.split("1")
      val koko = chunks.sortBy(x => x.size).reverse
      koko.head.size
    }
  }

  def cleanZeros(s: String): String = {
    @tailrec
    def cleanZeroTail(binaryList: List[Char]): List[Char] = {
      binaryList match {
        case (head::tail) => {
          if(head == '0') {
            cleanZeroTail(tail)
          } else {
            binaryList
          }
        }
        case Nil => List.empty
      }
    }
    cleanZeroTail(cleanZeroTail(s.toList).reverse).mkString.reverse
  }

}
