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

    val dy = new DynamicClass
    dy.name1 = "tome"
    println(dy.name1)
    println(dy.getValueByName("john"))

    println(Fraction(3)+Fraction(4))
    println(Fraction(3)/Fraction(-1))
    println(3/(-1))

    var num = Array(1,1,0,1)
    println(num.mkString.toLong)
   // println(Fraction.commonDivisor(15,21))

    val bb = BigSeq
    val seq = BigSeq.update(1,0,1)
    println(seq)
  }
}
