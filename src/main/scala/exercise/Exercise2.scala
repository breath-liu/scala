package exercise

import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import scala.util.Random
import scala.util.control.Breaks

/**
  * Created by Administrator on 2018/1/5.
  */
object Exercise2 {

  def main(args: Array[String]): Unit = {
    for (i<- -10 until -1 by 2 reverse ){
      print(s"$i,")
    }
    println()

    val list = List(-5 to 5:_*)
    println(list)
    println(list.filter(_>0))

    val sum = list.sum//求和
    println(sum)

    val sorted = list.sorted//排序
    println(sorted)
    val s = list.sortWith(_>_)//指定比较器
    println(s)

    val list2 = List(6)
    println(list++:list2)
    println(list)
    println(list2)

    val n = 5
    val arr = new Array[Int](n)//初始话空数组要用new，不然调用的是apply
    for (i<- 0 until n){
      arr(i) = Random.nextInt%n
    }

    println(arr.mkString(",==========="))


    println(list.reverse)
    val listbuf = ListBuffer(0 to 5:_*)
    println(listbuf.reverse)

    removeDuplicate(Array(1,2,3,3,2,1))

    val arr2 = ArrayBuffer(2,3,-1,5,-2,-3,6)
    deleteNegative(arr2)
  }

  def removeDuplicate(arr:Array[Int]){
    val arrbuf = new ArrayBuffer[Int]
    for (i<-0 until arr.length-1){
      if(!arrbuf.contains(arr(i))){
        arrbuf+=arr(i)
      }
    }
    println(arrbuf)
    println(arr.distinct.mkString(","))//同样可以实现去重的作用
  }

  def deleteNegative(buffer:ArrayBuffer[Int]): Unit ={
    var prefix = new ArrayBuffer[Int]
    var suffix = new ArrayBuffer[Int]
    val loop = new Breaks
    loop.breakable{
      for (i<-buffer){
        if(i<0){
          val index = buffer.indexOf(i)
          prefix = buffer.take(index+1)
          suffix = buffer.drop(index+1)
          loop.break()
        }
      }
    }
    suffix.filter(_<0)//case 1
    val bf2 = suffix.sortWith(_>_)//case 2
    while(bf2.last<0){
      bf2.trimEnd(1)
    }
    prefix++=bf2
    println(prefix.mkString(","))
  }

}
