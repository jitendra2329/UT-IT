package com.knoldus.dataValidatorTest

import com.knoldus.dataValidator.PasswordValidation
import org.scalatest.flatspec.AnyFlatSpec

class PasswordValidationTest extends AnyFlatSpec {

  "A password" should "be invalid if it doesn't contains a digit" in {
    val validator = PasswordValidation("Jitendra Kumar", "jeetS$", "jk.sharma@gmail.com")
    assert(!validator.isValidPassword(validator.password))
  }

  it should "be invalid if it doesn't contains a lowercase letter" in {
    val validator = PasswordValidation("Jitendra Kumar", "JEET5813", "kumar.jeet@gmail.com")
    assert(!validator.isValidPassword(validator.password))
  }

  it should "be invalid if it doesn't contains an uppercase letter" in {
    val validator = PasswordValidation("Ram Kumar", "ram738$", "ram.kumar@gmail.com")
    assert(!validator.isValidPassword(validator.password))
  }

  it should "be valid if it contains the lowecase, upercase, special character and digit" in {
    val validator = PasswordValidation("Ajit", "ajitKnol123#", "ajit.knol@gmail.com")
    assert(validator.isValidPassword(validator.password))
  }

  it should "be invalid if it doesn't have a special character" in {
    val validator = PasswordValidation("Rajan", "rajanSharma233", "rajan.kumar@gmail.com")
    assert(!validator.isValidPassword(validator.password))
  }

  it should "be valid if it contains all the cases" in {
    val validator = PasswordValidation("Pawan", "pawanK232#", "pawan.kumar@email.com")
    assert(validator.isValidPassword(validator.password))
  }
}