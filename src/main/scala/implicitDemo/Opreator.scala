package implicitDemo

import scala.math.Ordering


class Opreator(val i:Int) {

  def ! = process(i)

  def process(i: Int):Int= {
    if(i==1)
      1
    else
      i*process(i-1)
  }
}

object Opreator{


  implicit def int2Op(j:Int)=new Opreator(j)
}
