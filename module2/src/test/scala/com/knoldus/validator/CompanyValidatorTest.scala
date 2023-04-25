package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import com.knoldus.models.Company

class CompanyValidatorTest extends AnyFlatSpec with Matchers {

  val companyValidator = new CompanyValidator

  "companyIsValid" should "return true as new company doesn't exist and have valid emailid" in {
    val newCompany: Company = Company("Wipro", "wipro@gmail.com", "Noida")
    companyValidator.companyIsValid(newCompany) shouldEqual true
  }

  it should "return false as company already exist" in {
    val newCompany: Company = Company("Incedo", "incedo@gmail.com", "Noida")
    companyValidator.companyIsValid(newCompany) shouldEqual false
  }

  it should "return false as emaild is not valid" in {
    val newCompany = Company("Travclane", "travclane.gmail.com", "Delhi")
    companyValidator.companyIsValid(newCompany) shouldEqual false
  }
}