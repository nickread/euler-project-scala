package euler

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Problem006Suite extends FunSuite {

  import Problem006._

  test("Least common multiple") {
    assert(diff(1 to 10) === 2640)
    assert(diff(1 to 100) === 25164150)
  }
}
