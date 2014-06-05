package com.durasoft.beginner

/*
 Find the number of elements of a list.
 Example:
 scala> length(List(1, 1, 2, 3, 5, 8))
 res0: Int = 6
*/
object P04 {

  def getLengthOfList2[T](ls:List[T]):Int = {
    ls match {
      case Nil => 0
      case _::tail => 1+ getLengthOfList2(tail)
      
    }
  }
  def getLengthOfList[T](len:Int,ls:List[T]):Int = {
    (len,ls) match{
      case (_,Nil) => 0
      case (_,x::Nil) => len + 1
      case (len,_::tail)=>getLengthOfList(len+1,tail)
      case _ => throw new Exception
    }    
  }
  def main(args: Array[String]): Unit = {
		  val lst1 = List(1, 1, 2, 3, 5, 8)
		  println(lst1.length)
		  println(getLengthOfList(0,lst1))
		  
		  val lst2 = List(1, 1, 2, 3, 5, 8,12,12,12,12,12,12,12,12,12)
		  println(getLengthOfList(0,lst2))
		  println(getLengthOfList(0,List()))
		  
		  println(getLengthOfList2(lst2))
  }

}