import com.example.passwordValidator.PasswordValidator
import org.scalatest.funsuite.AnyFunSuite

class PasswordValidatorTest extends AnyFunSuite{
  var checkPassword = new PasswordValidator()

  test("Check if password is valid or not"){
    val password = "Rahul@123"
    val expectedResult = true
    assert(checkPassword.isValidPassword(password) == expectedResult )
  }

  test("Check if entered password valid if length is more than 15"){
    val password = "Rahul@123SoniKnoldus"
    val expectedResult = false
    assert(checkPassword.isValidPassword(password) == expectedResult )
  }

  test("Check if entered password valid if length is less than 8"){
    val password = "Ra@12"
    val expectedResult = false
    assert(checkPassword.isValidPassword(password) == expectedResult )
  }

  test("Check if lowercase password is valid "){
    val password = "sonirahul@123"
    val expectedResult = false
    //should be false bcz it doesn't contain uppercase
    assert(checkPassword.isValidPassword(password) == expectedResult)
  }

  test("Check if password without digit passes"){
    val password = "Rahul@knol"
    val expectedResult = false
    //result should be false bcz input is without digit
    assert(checkPassword.isValidPassword(password) == expectedResult)
  }

  test("Check if password without special character is valid"){
    val password = "Rahulsoni123"
    val expectedResult = false
    assert(checkPassword.isValidPassword(password) == expectedResult)
  }
}
