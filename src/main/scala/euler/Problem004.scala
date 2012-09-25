package euler

import scala.collection.Iterator
import scala.annotation.tailrec

object Problem004 extends App {

  def digits(i: Int): Seq[Int] = {
    @tailrec
    def carryDigits(n: Int, carry: List[Int]): List[Int] = if (n < 10) n :: carry else carryDigits(n / 10, (n % 10) :: carry)
    carryDigits(i, List())
  }

  def isPalindrome(i: Int): Boolean = {
    if (i < 10)
      true
    else {
      val ds = digits(i)
      ds == ds.reverse
    }
  }

  def largestPalindrome(lowerBound: Int, upperBound: Int): Int = {
    val seq = for (
      i <- upperBound to lowerBound by -1;
      j <- i to lowerBound by -1
    ) yield i * j

    seq filter { isPalindrome } reduce { (x, y) => math.max(x, y) }
  }
}