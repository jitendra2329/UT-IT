package com.knoldus.db

import com.knoldus.models.Company
import scala.collection.immutable.HashMap

class CompanyReadDto {

  val knoldusCompany: Company = Company("Knoldus", "nashtack.knoldus@gmail.com", "Noida")
  val tcsCompany: Company = Company("TCS", "tcs.indea@gmail.com", "Noida")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "TCS" -> tcsCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)
}