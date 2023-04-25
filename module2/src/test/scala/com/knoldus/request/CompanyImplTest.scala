package com.knoldus.request

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator

class CompanyImplTest extends AnyFlatSpec with Matchers {

  val companyValidator = new CompanyValidator
  val companyImpl = new CompanyImpl(companyValidator)

  "createCompany" should "return valid company name" in {
    val company: Company = Company("HCL", "hcl93@gmail.com", "Noida")
    companyImpl.createCompany(company) shouldEqual Some(company.name)
  }

  it should "return None, the company already exist in database" in {
    val company: Company = Company("Knoldus", "hcl93@gmail.com", "Noida")
    companyImpl.createCompany(company) shouldEqual None
  }

  it should "return None, invalid email has been provided" in {
    val company: Company = Company("IVP", "ivp.gmail.com", "Noida")
    companyImpl.createCompany(company) shouldEqual None
  }
}