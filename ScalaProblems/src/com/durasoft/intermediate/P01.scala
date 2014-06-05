package com.durasoft.intermediate
/*
Duplicate the elements of a list a given number of times.
Example:
scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd) 
*/
object P01 {
	def duplicateN[T](n:Int,ls:List[T]):List[T] = {
	  ls match {
	    case Nil => Nil
	    case x :: tail => List.fill(n)(x) ::: duplicateN(n,tail)
	  }
	}
	def main(args:Array[String]):Unit = {
	  val lst1 = List('a, 'b, 'c, 'c, 'd)
	  val n:Int = 3
	  var lst2 = List[Any]()
	  lst1.foreach(i=>{1 to n foreach(j=>lst2 = lst2 :+ i)})
	  println(lst2)
	  println(duplicateN(n,lst1))
	  println(lst1.flatMap(i=>List.fill(4)(i)))
	}
}