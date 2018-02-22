package rbTree


class Node(var value:Int,var parent:Node = null ,var left:Node = null,var right:Node = null){
  override def toString: String = {
    value.toString
  }
}


object Node{
  def apply(value:Int): Node = new Node(value)
}