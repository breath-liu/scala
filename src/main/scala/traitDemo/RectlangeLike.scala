package traitDemo

import java.awt.Rectangle
import java.awt.geom.Ellipse2D

trait RectlangeLike {

  this:Ellipse2D.Double =>
    def translate(dx: Double, dy: Double): Unit = println("trans")
    def grow(h: Double, v: Double): Unit = println("grow")

    override def getX: Double = {
      println("xxxxxxxxxxxxxxxxxxxx")
      this.x
    }

}
