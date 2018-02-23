package rbTree

import scala.math.Ordering

object RichNode {

  implicit object OrderNode extends Ordering[Node]{
    override def compare(x: Node, y: Node): Int = {
      x.value.compareTo(y.value)
    }
  }
}
