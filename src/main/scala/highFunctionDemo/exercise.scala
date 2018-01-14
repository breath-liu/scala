package highFunctionDemo

import scala.collection.mutable

object exercise {

  def main(args: Array[String]): Unit = {
    println(values(i=>i*i)(-5,5))
    val arr = Array(1,2,3,4,5)
    println(getArrayMax(arr))
    val res = arr.foldLeft(1)((a,b)=>a*b)
    println(res)
    val pairs = (1 to 10) zip (11 to 20)
    pairs.map(t=>t._1+t._2)
    val fun = adjustMap(_+_)
    println(pairs.map(fun(_)))
  }

  def values(f:(Int)=>Int)(min:Int,max:Int)={
    var map = new mutable.LinkedHashMap[Int,Int]()
    for (i <- min to max){
      map+=(i->f(i))
    }
    map
  }

  def getArrayMax(arr:Array[Int])={
      arr.reduceLeft((a,b)=>if(a>b)a else b)
  }

  def adjustMap(f:(Int,Int)=>Int)={
    (a:((Int, Int)))=>f(a._1,a._2)
  }
}
