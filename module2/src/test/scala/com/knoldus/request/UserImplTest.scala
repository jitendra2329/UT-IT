package com.knoldus.request

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import com.knoldus.models.User
import com.knoldus.validator.UserValidator

class UserImplTest extends AnyFlatSpec with Matchers{

  val userValidator = new UserValidator
  val userImpl = new UserImpl(userValidator)

  "createUser" should "return a valid emailid" in {
    val user: User = User("Jeet", "Sharma", 24, 18000.0, "Software Consultant", "Knoldus", "jeet.sharma@knoldus.com")
    userImpl.createUser(user) shouldEqual Some(user.emailId)
  }

  it should "return none because Company Name doesn't exist" in {
    val user = User("Pawan", "Kumar", 25, 14000.0, "Software Consultant", "Apple", "pwnkmr.dhiman@apple.in")
    userImpl.createUser(user) shouldEqual None
  }

  it should "return none as emailid is not valid" in {
    val user = User("Ayush", "Kumar", 26, 20000.0, "Software Consultant", "TCS", "@tcs.com")
    userImpl.createUser(user) shouldEqual None
  }
}