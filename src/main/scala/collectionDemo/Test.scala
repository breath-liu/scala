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

    val count = l1.reduce(_+_)//reduce=reduceleft

    val flodleft = (10/:(1::2::3::Nil))(_+_)//flodleft
    println(flodleft)

    val str = "asadkjsjclk"
    val m = collection.mutable.Map[Char,Int]()
    (m /: str){
      (map,c)=>map+=(c->(map.getOrElse(c,0)+1))
    }
    println(m)

    //11for(i<-(0 until 10000).par) print(s"$i,")

    getMiddle(Array("a","b"))

    val i = List(1,2,3).par.aggregate(0)({ (sum, ch) => {println(f"sum====$sum");sum/2 + ch.toInt} }, { println("add");(p1, p2) => {println(f"add======$p1,$p2");p1 + p2} })
    println(i)
  }

  def itrate(list:List[Int]): Unit ={
    if(list!=Nil){
      println(list.head)
      itrate(list.tail)
    }
  }

  def getMiddle[Int,X](arr:Array[String])={
    arr(arr.length/2)
  }

  def mk(seq:Seq[Any]): Unit ={
    seq.reduceLeft(_+","+_)
  }

}
