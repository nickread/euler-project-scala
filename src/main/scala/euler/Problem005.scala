package euler

import scala.collection.Iterator
import scala.collection.immutable.Set

object Problem005 extends App {

  def primes(): Stream[Int] = {
    def _primes(s: Stream[Int]): Stream[Int] =
      Stream.cons(s.head, _primes(s.tail filter (_ % s.head != 0)))
    _primes(Stream.from(2))
  }

  def lcm(input: Seq[Int]): Int = {

    // Implement the usual LCM algorithm, like that documented
    // in http://en.wikipedia.org/wiki/Least_common_multiple#A_simple_algorithm

    def collectPrimeDivisors(divided: Seq[Int], primes: Stream[Int]): Seq[Int] = {
      val dsGtTwo = divided.filter(x => x != 1)
      if (dsGtTwo.isEmpty)
        Seq()
      else {
        val divisor = primes.head
        val ds = dsGtTwo.map(x => if (x % divisor == 0) x / divisor else x)
        Seq(divisor) ++ collectPrimeDivisors(ds,
          if (ds.filter(x => x % divisor == 0).isEmpty)
            primes.tail
          else
            primes)
      }
    }
    collectPrimeDivisors(input, primes).product
  }
}