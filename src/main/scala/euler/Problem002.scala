package euler

import scala.collection.Iterator

object Problem002 extends App {
  def sumEvenFib(to: Int): Int = {
    lazy val fib: Stream[Int] = Stream.cons(1,
      Stream.cons(2,
        fib.zip(fib.tail) map { case (i, j) => i + j }))

    fib filter { x => x % 2 == 0 } takeWhile { x => x < to } sum
  }
}