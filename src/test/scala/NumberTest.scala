import com.example.calculations.Number
import org.scalatest.funsuite.AnyFunSuite

class NumberTest extends AnyFunSuite{
  var check = new Number()

  //Test cases to check isPalindrome method
  test("This test case checks if number is palindrome or not"){
    var number=121
    var expectedResult:Boolean = true
    assert(check.isPalindrome(number) == expectedResult)
  }

  test("This test case if negative number is palindrome or not"){
    var number = -121
    var expectedResult = false
    assert(check.isPalindrome(number) == expectedResult)
  }

  test("Number is pallindrome if it is zero 0"){
    var number = 0
    var expectedResult = true
    assert(check.isPalindrome(number) == expectedResult)
  }

  test("Number should not be palindrome"){
    var number = 1234
    var expectedResult = false
    assert(check.isPalindrome(number) == expectedResult)
  }


  //Test cases to check factorial method
  test("This test will check if factorial of number is right or not"){
    var number = 5
    var expectedResult = 120
    assert(check.factorialOf(number) == expectedResult)
  }
  test("This test will check if factorial of 0 is 1"){
    var number = 0
    var expectedResult = 1
    assert(check.factorialOf(number) == expectedResult)
  }
  test("This test will check is factorial of number is right or not"){
    var number = 10
    var expectedResult = 3628800
    assert(check.factorialOf(number) == expectedResult)
  }
}
