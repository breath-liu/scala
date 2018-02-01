package implicitDemo

class Temp[T](val value:T) {


}

object Temp{
  def apply[T](implicit temp:Temp[T]) ={
    println("aaa")
    1
  }
  implicit val temp1 = new Temp[Int](1)

}
