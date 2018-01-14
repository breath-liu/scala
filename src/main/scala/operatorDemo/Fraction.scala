package operatorDemo

class Fraction(val num:Int) {//scala类的的字段总是私有的，访问修饰符决定get,set方法的可见性

  def +(other:Fraction)={
    this.num+other.num
  }

  def /(other:Fraction)={
    val comm = Fraction.commonDivisor(this.num,other.num)
    val x = BigDecimal(this.num)
    val y = BigDecimal(other.num)
    (x/y)/(x/y)
  }

}

object Fraction{
  def apply(num: Int): Fraction = new Fraction(num)

  def commonDivisor(x:BigDecimal,y:BigDecimal):BigDecimal={//递归要显示指定返回类型 欧几里得算法
    var max = x
    var min = y
    if(x<y){
      min = x
      max = y
    }
    val res = max%min
    if(res!=0){
      commonDivisor(res,min)
    }else{
      min
    }
  }

}
