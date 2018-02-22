package rbTree

class RbTree {

  var root:Node = _

  def left_rotate(node:Node){
    if(root.eq(node))
      root = node.right
    val right = node.right
    val sLeft = right.left
    right.parent = node.parent
    node.parent = right
    right.left = node
    node.right = sLeft
    sLeft.parent = node
  }

  def right_rotate(node:Node){
    if(root.eq(node))
      root = node.right
    val right = node.right
    val sLeft = right.left
    right.parent = node.parent
    node.parent = right
    right.left = node
    node.right = sLeft
    sLeft.parent = node
  }

  def insert(node:Node): Unit ={
    root match {
      case null => root = node
      case _ =>
        var direct = false
        var current = root
        var parent:Node = null
        while (current!=null){
          import RichNode._//提供一个隐式的比较函数Ordering
          import Ordered._//接受一个Ordering并且转换为Ordered可以使用<,>等方法，二者缺一不可
          parent = current
          if(node<current){
            direct = true
            current = current.left
          }
          else{
            direct = false
            current = current.right
          }
        }
        if(direct)
          parent.left = node
        else
          parent.right = node
        node.parent = parent
    }
  }

  def peek(){//“约定好如果方法包含side effect,要写括号” _不太明白在说什么
    peek(root)
  }

  def peek(node: Node): Unit = {
    if(node!=null){//尾递归是指函数的最后一行是递归调用，无需进行回溯，栈空间占用由O(n)变为O(1)
      println(node)
      peek(node.left)
      peek(node.right)
    }


  }

}

object RbTree{

  def apply(): RbTree = new RbTree()
}
