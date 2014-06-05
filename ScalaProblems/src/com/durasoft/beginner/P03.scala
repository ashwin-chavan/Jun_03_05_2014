package com.durasoft.beginner

/*
 Find the Kth element of a list.
 By convention, the first element in the list is element 0.
 Example:
 scala> nth(2, List(1, 1, 2, 3, 5, 8))
 res0: Int = 2 
*/
object P03 {

  def getElementAt[T](index:Int,ls:List[T]):T = {
    (index,ls) match {
      case (0,x::_::Nil) => x
      case (index,_::tail) => getElementAt(index-1,tail)	
      case (_,Nil) => throw new Exception()
    }
    
  }
  def main(args: Array[String]): Unit = {
    
    val lst1 = List(21, 14, 52, 65, 98, 82)
    val index = 3 
    println(lst1(3))
    println(getElementAt(4,lst1))
    
  }

}