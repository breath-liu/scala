package packageDemo

/**
  * Created by Administrator on 2018/1/9.
  */
class Random(var seed:Int=20) {//线性同余法产出随机数

  val a = BigDecimal(1664525)
  val b = BigDecimal(1013904223)
  val n = 32

  def setSeed(seed:Int): Unit ={
    this.seed = seed
  }

  def nextInt():Int={
    val temp = (seed+a+b)%BigDecimal(2).pow(n)
    seed = temp.toInt
    seed
  }

  def nextDouble():Double={
    val temp = (seed+a+b)%BigDecimal(2).pow(n)
    seed = temp.toInt
    temp.toDouble
  }

}

object Random{
  def apply(seed:Int): Random = new Random(seed)
}
