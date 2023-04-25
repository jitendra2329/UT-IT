package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import com.knoldus.models.User

class UserValidatorTest extends AnyFlatSpec with Matchers {

  val userValidator = new UserValidator

  "userIsValid" should "return true as company name already exist and email is valid" in {
    val user: User =  User("Jeet", "Sharma", 24, 18000.0, "Software Consultant", "Knoldus", "jeet.sharma@knoldus.com")
    userValidator.userIsValid(user) shouldEqual true
  }

  "userIsValid" should "return false as company name doesn't exist" in {
    val user = User("Pawan", "Kumar", 25, 14000.0, "Software Consultant", "Apple", "pwnkmr.dhiman@apple.in")
    userValidator.userIsValid(user) shouldEqual false
  }

  "userIsValid" should "return false as company name exist but emailid is not valid" in {
    val user = User("Ayush", "Kumar", 26, 20000.0, "Software Consultant", "TCS", "@tcs.com")
    userValidator.userIsValid(user) shouldEqual false
  }
}