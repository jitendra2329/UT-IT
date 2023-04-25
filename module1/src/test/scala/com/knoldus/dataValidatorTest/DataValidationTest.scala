package com.knoldus.dataValidatorTest

import com.knoldus.dataValidator.DataValidation
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DataValidationTest extends AnyFlatSpec with Matchers {

  val dataValidation = new DataValidation

  "isContainsDuplicateElement" should "return true in case of list containing duplicate elements" in {
    val list = List(51, 12, 123, 64, 25, 90, 12, 51)
    val expectedResult = dataValidation.isContainsDuplicateElement(list)
    expectedResult shouldEqual true
  }

  it should "return false if a list does not contain duplicate elements" in {
    val list = List(32, 45, 22, 89, 68)
    val result = dataValidation.isContainsDuplicateElement(list)
    result shouldEqual false
  }

  it should "return false if an empty list is passed as input" in {
    val list = List.empty[Int]
    val result = dataValidation.isContainsDuplicateElement(list)
    result shouldEqual false
  }

  "findFactorial" should "return a Success with the factorial value for a non-negative integer input" in {
    val input = 4
    val result = dataValidation.findFactorial(input)
    result.isSuccess shouldEqual true
    result.get shouldEqual 24
  }

  it should "return 1 if input is 0" in {
    val input = 0
    val result = dataValidation.findFactorial(input)
    result.isSuccess shouldEqual true
    result.get shouldEqual 1
  }

  it should "return a Failure for a negative number" in {
    val input = -1
    val result = dataValidation.findFactorial(input)
    result.isFailure shouldEqual true
  }
}