package euler

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Problem004Suite extends FunSuite {

  import Problem004._

  test("2 broken into digits") {
    assert(digits(2) === Seq(2))
  }

  test("2345678 broken into digits") {
    assert(digits(2345678) === Seq(2, 3, 4, 5, 6, 7, 8))
  }

  test("9 is palindromic") {
    assert(isPalindrome(9))
  }

  test("90 is NOT palindromic") {
    assert(isPalindrome(90) === false)
  }

  test("909 is palindromic") {
    assert(isPalindrome(909))
  }

  test("9009 is palindromic") {
    assert(isPalindrome(9009))
  }

  test("9109 is NOT palindromic") {
    assert(isPalindrome(9109) === false)
  }
  
  test("Largest palindrome from the product of two 2-digit numbers") {
    assert(largestPalindrome(10, 99) === 9009)
  }
  
  test("Largest palindrome from the product of two 3-digit numbers") {
    assert(largestPalindrome(100, 999) === 906609)
  }
}
