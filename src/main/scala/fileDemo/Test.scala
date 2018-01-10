package fileDemo

import scala.io.Source

/**
  * Created by Administrator on 2018/1/10.
  */
object Test {

  def main(args: Array[String]): Unit = {
    var source:Source = null
    try {
      source = Source.fromFile("C:\\Users\\Administrator\\Desktop\\sd.sql","utf-8")
      //println(source.mkString)//全部打印
      val iterator = source.getLines()
     // val array = iterator.toArray
     // println(array.mkString(","))
     /* for(i<-iterator){
        println(i)
      }*/
      //iterator.foreach(i=>println(i))
      val it2 = iterator.map(i=>i+"aaa")//map 与 foreach区别map有返回值，forecach只能用来遍历
      it2.foreach(println(_))
    }finally {
      println("close")
      if (source!=null)
        source.close
    }
  }

}
