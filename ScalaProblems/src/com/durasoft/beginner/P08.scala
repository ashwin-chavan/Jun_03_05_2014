package com.durasoft.beginner
/*
Split a list into two parts.
The length of the first part is given. Use a Tuple for your result.
Example:
scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
*/
object P08 {
  def split[T](splitNum:Int,ls:List[T]):(List[T],List[T]) = {
    (splitNum,ls) match {
      case(_,Nil) => (Nil,Nil)
      case(0,list)=>(Nil,list)
      case(splitNum,x::tail)=>{
        val (ls1,ls2) = split(splitNum-1,tail)
        (x::ls1,ls2)
      }
    }
  }
  def main(args: Array[String]): Unit = {
    val lst = List('a','b','c','d','e','f','g','h','i','j','k')
    val splitNum = 3
    println(lst.splitAt(splitNum))
    println(split(5,lst))
    println(split(0,lst))
    println(split(5,Nil))
  }

}