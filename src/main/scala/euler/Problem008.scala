package euler

import scala.collection.immutable.Stream

object Problem008 extends App {
  def maxProductOfSequence(number: String, seqLength: Int): Int = {
    number.filterNot(_.isWhitespace).tails.map { x =>
      val ds = x.take(seqLength)
      if (ds.length < seqLength)
        0
      else
        ds.map(x => x.toInt - '0').product
    }.max
  }
}