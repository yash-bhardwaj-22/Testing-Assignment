package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee
import com.knoldus.validator.{EmailValidator, EmployeeValidator}
import org.scalatest.funsuite.AnyFunSuite

class EmployeeImplIntegrationTest extends AnyFunSuite{
  val companyName = new CompanyReadDto
  val validateEmail = new EmailValidator
  val employeeValidator = new EmployeeValidator(companyName,validateEmail)

  val employeeImpl = new EmployeeImpl(employeeValidator)

  test("user can not created bcz company doent exist"){
    val rahul:Employee = new Employee("Rahul","Soni",22,15000,"Intern","Google","rahul.soni@gmail.com")
    val result = employeeImpl.createEmployee(rahul)
    assert(result.isEmpty)
  }

  test("user can not created bcz email is invalid"){
    val rahul:Employee = new Employee("Rahul","Soni",22,15000,"Intern","Knoldus","rahul.soni@gmailcom")
    val result = employeeImpl.createEmployee(rahul)
    assert(result.isEmpty)
  }
  test("user can not created bcz email invalid and company doesnt exist in DB"){
    val rahul:Employee = new Employee("Rahul","Soni",22,15000,"Intern","Google","rahul.soni@gmaicom")
    val result = employeeImpl.createEmployee(rahul)
    assert(result.isEmpty)
  }
  test("user can be created"){
    val rahul:Employee = new Employee("Rahul","Soni",22,15000,"Intern","Knoldus","rahul.soni@gmail.com")
    val result = employeeImpl.createEmployee(rahul)
    assert(result.isDefined)
  }
}
