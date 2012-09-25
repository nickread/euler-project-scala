package euler

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Problem001Suite extends FunSuite {

  import Problem001._

  test("Sum of all mulitple of 3 and 5 below 10") {
    assert(sumUpTo(10) === 23)
  }
  
  test("Sum of all mulitple of 3 and 5 below 1000") {
    assert(sumUpTo(1000) === 233168)
  }  
}
