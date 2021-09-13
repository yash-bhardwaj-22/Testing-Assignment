package com.knoldus.validator

import org.scalatest.funsuite.AnyFunSuite

class EmailValidatorTest extends AnyFunSuite{
  val emailValidator = new EmailValidator
  test("Email is invalid without recipient name"){
    assert(!emailValidator.emailIdIsValid("@gmail.com"))
  }

  test("Email is not valid if it not contains @ character"){
    assert(!emailValidator.emailIdIsValid("@RahulSoni.rsd.gmail.com"))
  }

  test("it should be invalid if it doesn't contain domain name"){
    assert(!emailValidator.emailIdIsValid("Rahulsoni@"))
  }
  test("email should not valid if it doesn't contain .com,.org, or .net"){
    assert(!emailValidator.emailIdIsValid("rahul@gmail"))
  }
  test("email should valid if it contani all required parameters"){
    assert(emailValidator.emailIdIsValid("rahul.soni@gmail.com"))
  }
}
