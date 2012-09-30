package euler

import scala.collection.Iterator
import scala.collection.immutable.Set

object Problem006 extends App {

  def square(x: Int): Int = x * x

  def sumOfSquares(input: Seq[Int]): Int = input.map(square).sum

  def squareOfSums(input: Seq[Int]): Int = square(input.sum)

  def diff(input: Seq[Int]): Int = squareOfSums(input) - sumOfSquares(input)
}