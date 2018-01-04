/**
  * Created by Administrator on 2018/1/3.
  */
object FunctionDemo2 {

  def main(args: Array[String]): Unit = {
    var increament = (x:Int)=>{
      //println(1)
      x+1
    }
    var inc = 1+(_:Int)
   // val res = increament(2)
    //println(res)

    val arr = Array(1,2,3,4,5)
    println(arr.map(increament).mkString(","))//case 1
    println(arr.map((x:Int)=>(x+1)).mkString(","))//case 2 //写这种累赘的语法也会报警告,Unnecessary parentheses,这有一条执行语句时不建议写括号
    println(arr.map(x=>(x+1)).mkString(","))//case 3
    println(arr.map(x=>x+1).mkString(","))//case 4
    println(arr.map(_+1).mkString(","))//case 5

    val fun1=1+(_:Double)//这个_类似匿名参数???
    println(fun1(5))

    //val str = convertIntToString((x:Int)=>x+2)
  //  println(str)
    val x=multiplyBy(10)
    println(x(4))

    val c = new C
    val f = c.finc()
    println(f)
  }
  def convertIntToString(f:Int=>Double)=
    f(4)

  def multiplyBy(factor:Double)=
    (x:Double)=>factor*x

  class C{//函数与方法的区别
    var acc = 0
    def minc = {acc+1}
    val finc = ()=>acc+1
    //def minc = { acc += 1 }
  }
}
