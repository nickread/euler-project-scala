package euler

object Problem001 extends App {
  def sumUpTo(upperBound: Int): Int = {
    (1 until upperBound) filter { x => x % 3 == 0 || x % 5 == 0 } sum
  }
}