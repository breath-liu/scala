package exercise

import java.time.LocalDate

/**
  * Created by Administrator on 2018/1/5.
  */
object exercise1 {

  def main(args: Array[String]): Unit = {
    val str = "Hello"
    //打印一个字符串中每个字符的unicode码乘积
    var result = BigInt(1)
    for (i<-0 until str.length){
      result*=str.charAt(i).toInt
    }
    println(result)
    result = 1
    str.foreach(result*=_.toLong)
    println(result)

    println(product(str))

    var year = 2017
    var month = 10
    var day = 2
    println(date"asas$year$month$day")
  }

  //递归实现
  def product(str:String):Long={
    if(str.length==0)
      1
    else
      str.charAt(0).toLong*product(str.drop(1))
  }

  implicit class DateInterPolater(val sc:StringContext) extends AnyVal{//自定义插值器
    def date(args:Any*):LocalDate={
        println(args.length)
        if(args.length==3) {
          val parts = sc.parts
          println(parts)
          LocalDate.of(args(0).toString.toInt,args(1).toString.toInt,args(2).toString.toInt)
        }
        else
          throw new NullPointerException
    }
  }
}

