package com.durasoft.beginner

/*
	Reverse a list.
	Example:
	scala> reverse(List(1, 1, 2, 3, 5, 8))
	res0: List[Int] = List(8, 5, 3, 2, 1, 1)
 */
object P05 {

	def reverseList[T](ls:List[T]):List[T] = {
	  ls match {
	    case Nil => Nil
	    case x :: tail =>  reverseList(tail):::List(x)
	  }
	}
	def main(args: Array[String]): Unit = {
			val lst1 = List(8, 5, 3, 2, 1, 1)
			println(lst1.reverse)
			println(reverseList(lst1))
			
	}

}