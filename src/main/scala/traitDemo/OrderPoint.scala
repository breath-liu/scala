package traitDemo

import java.awt.Point

class OrderPoint(x:Int,y:Int) extends Point(x,y) with Ordered[OrderPoint]{

  override def compare(that: OrderPoint): Int = {
    this.x + this.y - (that.x + that.y)
  }

  override def getX: Double = {
    println("xxxxxxxxx")
    this.x
  }
}
