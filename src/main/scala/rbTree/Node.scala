package rbTree

import rbTree.Color.Color


class Node(var value:Int,var color:Color = Color.Black,var parent:Node = Node.nil ,var left:Node = Node.nil,var right:Node = Node.nil){
  override def toString: String = {
    value.toString+"["+color+"]"
  }

}


object Node{
  def apply(value:Int): Node = new Node(value)

  private def nil : Node = new Node(-1,Color.Black,null,null,null)
}