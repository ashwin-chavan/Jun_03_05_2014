package com.durasoft.beginner

/*
Remove the Kth element from a list.
Return the list and the removed element in a Tuple. Elements are numbered from 0.
Example:

scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b) 
*/
object P09 {
  def removeAt[T](index:Int,ls:List[T]):(List[T],T) = {
    (index,ls) match {
      case(_,Nil) => throw new Exception
      case(0,x::tail)=>{        
        println("************Index: " + index + "***********")
        println(x)
        println(ls)
        (tail,x)}
      case(_,x::tail) =>{
        println("************Index: " + index + "***********")
        println(x)
        
        val (tempList,elem) = removeAt(index-1,tail)
        println("**After removeAt: " + (index-1))
        println (tempList,elem)
        println(ls)
        (ls.head::tempList,elem)
      }
    }
  }
  def main(args: Array[String]): Unit = {
     val lst = List('a','b','c','d','e')
     val index = 2
     println(removeAt(index,lst))
  }

}