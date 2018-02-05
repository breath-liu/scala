package typeDemo

import scala.reflect.ClassTag


object Test {

  def main(args: Array[String]): Unit = {
    val comp = new Comp("a","ab")
    println(comp.smaller())
    val comp2 = new Comp(1,2)
    println(comp2.smaller())

    implicit object ComImpl extends Comparable[String]{
      override def compareTo(o: String): Int = 1
    }
    val co = new Comp_one("a","ab")
    println(co.smaller)



    val arr = makePair(3,5)
    println(arr.mkString(","))


    //println(implicitly(ClassTag[Int].apply(_)))
  }

  def makePair[T:ClassTag](first:T, second:T)={
    val arr = new Array[T](2)
    arr(0) = first
    arr(1) = second
    arr
    /*val list = List(first,second)
    list*/
  }


}
