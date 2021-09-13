package com.knoldus.request

import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.funsuite.AnyFunSuite

class EmployeeImplTest extends AnyFunSuite{
  val employeeValidator = mock[EmployeeValidator]
  val rahul:Employee = new Employee("Rahul","Soni",22,15000,"Intern","Knoldus","rahul.soni@gmail.com")
  val userImpl = new EmployeeImpl(employeeValidator)

  test("User can be ceated"){
    when(employeeValidator.employeeIsValid(rahul)) thenReturn(true)
    val result = userImpl.createEmployee(rahul)
    assert(result.isDefined)
  }
  test("User can not be created"){
    when(employeeValidator.employeeIsValid(rahul)) thenReturn(false)
    val result = userImpl.createEmployee(rahul)
    assert(result.isEmpty)
  }
}
