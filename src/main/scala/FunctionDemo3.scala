/**
  * Created by Administrator on 2018/1/3.
  */
object FunctionDemo3 {
  def main(args: Array[String]): Unit = {
    lazy val helloString="Hello Crazy World"
    println(transform(_+"1"))
    println(multiply(5)(10))
  }
  def transform(x:String=>String)=x("a")

  def multiply(a:Double)(b:Double):Double=a*b//case1
  def multiply2(a:Double)=(b:Double)=> a*b//case2
}


