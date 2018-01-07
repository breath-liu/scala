package classDemo2

import classDemo.Item

object Test {
  def main(args: Array[String]): Unit = {
    val c = new Counter
    val va = c.increment//加不加括号都可以
    val value = c.current//不能用括号调用一个没有声明参数的函数

    val item = new Item("cc",20)
    println(item.brand)
  }
}
