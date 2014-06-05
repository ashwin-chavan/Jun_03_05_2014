package com.durasoft.beginner

/*
 Find the last but one element of a list.
    Example:
    scala> penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5
 * */
object P02 {
    def getThePenultimateOne[T](ls:List[T]):T = {
      ls match {
        case x ::_::Nil => x
        case _ :: tail => getThePenultimateOne(tail)
        case Nil => throw new Exception
      }      
    }
       
	def getLastButOne[T](ls:List[T]):T = ls(ls.length - 2)
	
	def main(args: Array[String]): Unit = {
			val lst1 = List(1,1,2,3,4,57,88)
					println(lst1(lst1.length - 2))

					val lst2 = List(11,14,23,4,35,68,97)
					println(getLastButOne(lst2))
					println(getThePenultimateOne(lst2))
					
	}
}