package rbTree

import rbTree.Color.Color


class Node(var value:Int,var color:Color = Color.Black,var parent:Node = null ,var left:Node = null,var right:Node = null){
  override def toString: String = {
    value.toString+"["+color+"]"
  }
}


object Node{
  def apply(value:Int): Node = new Node(value)
}