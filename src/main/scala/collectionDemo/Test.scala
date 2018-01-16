package collectionDemo

import scala.collection.mutable.ListBuffer

object Test {

  def main(args: Array[String]): Unit = {
    val l1 = 1::2::3::Nil
    val l2 = List(2,1,2,3)
    println(l1==l2)//l1==l2

    println(l1(2))

    val buf = ListBuffer(1,2,3,4)
    itrate(l1)

    var s1 = Set(1,7,2,9)
    val s2 = Set(2,3,5,7)
    println(s1|s2)//并集
    println(s1&s2)//交集
    println(s1&~s2)//差集
    s1+=10
    //s1(0) = 0
    println(s1)
    val map = l2.groupBy(_+"a")
    println(map)
  }

  def itrate(list:List[Int]): Unit ={
    if(list!=Nil){
      println(list.head)
      itrate(list.tail)
    }
  }

}
