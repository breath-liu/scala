package operatorDemo

object Demo {
  def main(args: Array[String]): Unit = {
    val op = new Op(2)
    println(-op)

    Op() = 2//update方法

    val Op(a,b) = Op(1,2)//unapply方法 也叫提取器
    println(a)
    println(b)

    println(3+4->5)
    //3 -> 4 + 5
    //println(3->4+5)
  }
}
