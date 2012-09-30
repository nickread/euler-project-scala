package euler

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Problem005Suite extends FunSuite {

  import Problem005._

  test("Least common multiple") {
    assert(lcm(1 to 10) === 2520)
    assert(lcm(1 to 20) === 232792560)
  }
}
