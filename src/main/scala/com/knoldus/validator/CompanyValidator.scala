package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator(companyName:CompanyReadDto, validateEmail: EmailValidator) {

  def companyIsValid(company: Company): Boolean = {
    if(companyName.getCompanyByName(company.name).isEmpty  && validateEmail.emailIdIsValid(company.emailId)){
      true
    }
    else
      false
  }
}
