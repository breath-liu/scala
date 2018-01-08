package classDemo2

import classDemo.Item
import classDemo2.OutterClass.InnerC


object Test {
  def main(args: Array[String]): Unit = {
    val c = new Counter
    val va = c.increment//加不加括号都可以
    val value = c.current//不能用括号调用一个没有声明参数的函数

    val item = new Item("cc")
    println(item.brand)

    val out = new OutterClass
    val out2 = new OutterClass
    val inner = new out.Inner("aa")//创建内部类的语法
    val inner2 = new out2.Inner("bb")//创建内部类的语法
    println(inner.buf)
    inner.buf+=inner2 //错误语法，scala区分外部类对象

    val in1 = new InnerC("cc")//使用伴生对象
    val in2 = new InnerC("dd")
    in1.buf+=in2
    println(in1.buf)

    val time = new Time(20)
    val time2 = new Time(20,31)
    println(time.before(time2))

    val s = Stu(20,"aa")
    val s2 = Stu(22,"ab")
    println(s)
    println(s==s2)

  }
}
