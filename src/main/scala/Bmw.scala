/**
  * Created by Administrator on 2018/1/4.
  */
class Bmw extends Car with Shiny{//多继承
  override val brand = "bmw"
  override val shineRefraction: Int = 12

  override def drive: Unit = {
    println("im drive")
  }
}
