package com.durasoft.beginner

/*
  Find the last element of a list.
  Example:
  scala> last(List(1, 1, 2, 3, 5, 8))
  res0: Int = 8
 */
object P01 {
	
    def getLast[T](ls:List[T]) : T = ls.last 

    def getLastOne[T](ls:List[T]):T = {
      ls match {
        case x :: Nil => x
        case _ :: tail => getLastOne(tail)
        case _ => throw new Exception
      }
      
    }
    
	def main(args: Array[String]): Unit = {
			val lst1 = List(1,1,3,4,5,6)
			println(lst1.last)
			
			val lst2 = List(11,14,23,4,35,68,97)
			println(getLast(lst2))
			println(getLastOne(lst2))
	}

}