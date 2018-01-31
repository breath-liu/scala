package implicitDemo

import packageDemo.Random

object Task {

  def main(args: Array[String]): Unit = {
    import Opreator._
    println(5.!)


    import RichFraction._
    //val rich = RichFraction
    import implicitDemo._

    println(RichFraction.smaller(Fraction(3,0),Fraction(1,2)))

   // val ordering = implicitly(Ordering[Fraction])
    val ordering2 = implicitly(Ordering[Int])
   // println(ordering)
    println(ordering2)
    println(implicitly(Temp[Int]))//这样是调用apply方法获取隐式对象
    //fromLessThan((x,y)=>x==y)
    import Ordered._
    Fraction(2,3)>Fraction(2,0)
    'a'.toUpper

   // "abc".map()

  }
}
