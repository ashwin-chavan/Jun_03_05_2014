package com.durasoft.beginner

/*
Duplicate the elements of a list.
Example:
scala> duplicate(List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
*/
object P07 {
  def duplicate[T](ls:List[T]):List[T] = {
    ls match {
      case Nil => Nil
      case x :: tail =>List(x,x):::duplicate(tail)
    }
  }
  def main(args: Array[String]): Unit = {
	val lst1 = List("a","b","c","c","d")
	var lst2 = List[String]()
    lst1.foreach(i=>{lst2 = lst2 :+ i;lst2 =lst2:+i})
    println(lst2)
    
    println(duplicate(lst1))
    println(lst1 flatMap(i=>List(i,i)))
  }

}