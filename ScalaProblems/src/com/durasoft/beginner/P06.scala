package com.durasoft.beginner
/*
 Find out whether a list is a palindrome.
 Example:
 scala> isPalindrome(List(1, 2, 3, 2, 1))
 res0: Boolean = true 
*/
object P06 {

/*  def isPalindrome[T](ls:List[T]):Boolean = {
    ls match {
      case x::Nil => isPalindrome(List)
    }
  }*/
  def main(args: Array[String]): Unit = {
    val lst1 = List(1,2,3,2,1)
    
    println(lst1 == lst1.reverse)
    
    val lst2 = List(11,2,3,12,1)
    println(lst2 == lst2.reverse)
  }

}