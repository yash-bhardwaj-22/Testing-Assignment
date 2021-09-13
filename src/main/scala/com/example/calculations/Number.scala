package com.example.calculations

class Number extends Palindrome with Factorial {

//  This method checks if a number is palindrome number or not
  override def isPalindrome(num: Int): Boolean = {
    var reversed = 0
    var remainder = 0
    var temp = num

    while(temp>0){
      remainder = temp%10
      reversed = reversed*10 + remainder
      temp = temp / 10
    }
    if (reversed == num)
      true
    else
      false
  }

//  This method returns factorial of the number
  override def factorialOf(num: Int): Int = {
    var result =1;
    for(i <- 2 to num){
      result = result * i
    }
    result
  }

}
