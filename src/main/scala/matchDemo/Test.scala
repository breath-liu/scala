package matchDemo

object Test {

  case class Person(name:String,age:Int)//case类的成员变量默认是val的
  //case class ::[T](h:T,t:List[T]) extends List[T] list被声明为sealed不可以被继承

  def main(args: Array[String]): Unit = {
    demo6()
    /*val p = Person("tom",25)
    println(p)
    val p2 = p.copy()
    println(p2)*/

  }

  def demo1(): Unit ={
    val ch = "++"
    var sign = 0
    sign = ch match {
      case "+"|"++" => 1 //用|来分割多个选项
      case "-" => -1
      case  _ => 999
    }

    println(sign)

    sign = ch match {
      case _ if ch.length==3 => 2//添加守卫
      case "+"|"++" => 1 //用|来分割多个选项
      case "-" => -1
      case sign => 2
      case  _ => 999
    }
    println(sign)
  }

  def demo2(): Unit ={
    //val x = 0
    val i = 20
    //var j = 0
    val j = i%2 match {
      case aa => println(aa);"+"
      case _ => 0
    }
    println(j)
   // println(aa)
  }

  def demo3(): Unit ={
    var a:Any = BigInt(5)
    var b = a.getClass
    b match {
      case x:Class[BigInt] => a = -2
      //case _:BigInt => a = Int.MaxValue
    }
    println(a)
  }

  def demo4(): Unit ={
    var arr = Array(0,11,12)

    arr match {
      case Array(0) => println(0)
      case Array(x,y) => println(s"$x====$y")//变量要小写，不然会被认为是常量
      case Array(0,rest @ _*) => println(rest.mkString(","))
        //Array
    }

    println(arr.length)
    //Array.unapplySeq()

    val E = BigInt(3)
    val (E,r) = BigInt(10) /% 3//同时返回商和余数
    println(E)
    println(r)

    val i = 2
    val 2 = i//这不是一句赋值语句，而是一个匹配模式，如果i!=2将会报错
    println(s"${2}")
  }

  def demo5(): Unit ={
    /*sealed abstract class Color(value:String)
    case class Red(value: String) extends Color(value)
    case class Green(value: String) extends Color(value)
    case class Blue(value: String) extends Color(value)

    val r:Any = Blue("red")
    r match {
      case temp @Red(_) => println(temp)
    }*/

    abstract class A; // sealed abstract class A
    case class B(a:Int) extends A
    case class C(a:Int) extends A
    case class D(a:Int) extends A

    val a:A = B(1)

    a match {
      case e @ B(_) => println(e)
      case e @ C(_) => println(e)
    }
  }

  def demo6(): Unit ={
    val str = "3+4"
    println(str.collect{case '+'=>1})//偏函数，不完全列举函数

    val f:PartialFunction[String,Int] = {
      case "+" => -1
      case "-" => 1
    }

    val lift = f.lift//变为一个返回option的函数
    for (i<-lift("0")) println(i)//使用for来便利option
  }
}
