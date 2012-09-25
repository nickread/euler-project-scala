package euler

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Problem002Suite extends FunSuite {

  import Problem002._

  test("Sum even fibs up to 100") {
    assert(sumEvenFib(100) === 44)
  }
  
  test("Sum even fibs up to 4000000") {
    assert(sumEvenFib(4000000) === 4613732)
  }  
}
