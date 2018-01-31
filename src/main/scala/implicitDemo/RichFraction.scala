package implicitDemo

import scala.math.Ordering

class RichFraction[T:Ordering]{




}

object RichFraction{

  implicit object RichFraction1 extends Ordering[Fraction]{
    override def compare(x: Fraction, y: Fraction): Int = {
      val comp_a = x.a.compareTo(y.a)
      val comp_b = x.b.compareTo(y.b)
      (comp_a, comp_b) match {
        case (0,0) => 0
        case (x,y) if(x>0&&y>0) =>1
        case _ => -1
      }
    }
  }

  def smaller(x:Fraction,y:Fraction)(implicit ord:Ordering[Fraction])={
    ord.compare(x,y)
  }
}


