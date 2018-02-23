package rbTree

class RbTree {

  var root:Node = _

  def left_rotate(node:Node){
    val right = node.right
    val sLeft = right.left
    if(root.eq(node)){
      root = node.right
    }
    else {
      if(node.eq(node.parent.left))
        node.parent.left = right
      else
        node.parent.right = right
    }
    right.parent = node.parent
    node.parent = right
    right.left = node
    node.right = sLeft
    sLeft.parent = node
  }

  def right_rotate(node:Node){
    val left = node.left
    val sRight = left.right
    if(root.eq(node)){
      root = node.left
    }else{
      if(node.eq(node.parent.left))
        node.parent.left = left
      else
        node.parent.right = left
    }
    left.parent = node.parent
    node.parent = left
    left.right = node
    node.left = sRight
    sRight.parent = node
  }

  def rb_insert_fixup(node: Node): Unit = {
    var current = node
    while (current.parent.color == Color.Red){
      if(current.parent.eq(current.parent.parent.left)){//左节点
        val uncle = current.parent.parent.right
        if(uncle.color == Color.Red){// case 1
          uncle.color = Color.Black
          current.parent.color = Color.Black
          current.parent.parent.color = Color.Red
          current = node.parent.parent
        }else{
          if(current.eq(current.parent.right)){//case 2
            current = current.parent
            left_rotate(current)
          }
          current.parent.color = Color.Black//case 3
          current.parent.parent.color = Color.Red
          right_rotate(current.parent.parent)//经过这一步当前节点的父节点已经变为黑色，循环结束
        }
      }else{
        val uncle = current.parent.parent.left
        if(uncle.color == Color.Red){// case 1
          uncle.color = Color.Black
          current.parent.color = Color.Black
          current.parent.parent.color = Color.Red
          current = node.parent.parent
        }else{
          if(current.eq(current.parent.left)){//case 2
            current = current.parent
            right_rotate(current)
          }
          current.parent.color = Color.Black//case 3
          current.parent.parent.color = Color.Red
          left_rotate(current.parent.parent)//经过这一步当前节点的父节点已经变为黑色，循环结束
        }
      }
    }
    if(root.eq(current))
      current.color = Color.Black
  }



  def insert(node:Node): Unit ={
    root match {
      case null => root = node
        node.color = Color.Black
      case _ =>
        var direct = false
        var current = root
        var parent:Node = null
        while (current!=null&&current.value!= -1){
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
        node.color = Color.Red
        rb_insert_fixup(node)
    }
  }

  def peek(){//“约定好如果方法包含side effect,要写括号” _不太明白在说什么
    peek(root)
  }

  def peek(node: Node): Unit = {
    if(node!=null&&node.value!= -1){//尾递归是指函数的最后一行是递归调用，无需进行回溯，栈空间占用由O(n)变为O(1)
      println(node)
      peek(node.left)
      peek(node.right)
    }
  }

  def presuccessor(node:Node):Node = {
    var current = node.left
    var parent:Node = null
    while (current!=null&&current.value!= -1){
      parent = current
      current = current.right
    }
    parent
  }

  def rb_delete_fixup(delNode: Node) = ???

  //提供了另外一种删除方式，这种方式直接把后继节点直接接到删除节点上，相较与把删除节点的value直接改为后继节点，在卫星数据很多的情况下，避免了空间浪费
  def delete(value: Int): Unit ={
    val delNode = find(value)
    if(delNode!=null){
      if(delNode.left==null||delNode.left.value== -1)
        transplant(delNode,delNode.right)
      else if (delNode.right==null||delNode.right.value== -1)
        transplant(delNode,delNode.left)
      else {
        val successor = presuccessor(delNode)
        if(successor.parent.ne(delNode)){//如果不是删除节点的直接子节点
          transplant(successor,successor.left)
          successor.left = delNode.left
          delNode.left.parent = successor
        }
        transplant(delNode,successor)
        successor.right = delNode.right
        delNode.right.parent = successor
        successor.color = delNode.color
      }
      //if()
      //rb_delete_fixup(delNode)
    }
  }

  def find(value:Int):Node = {
    var current = root
    while (current!=null&&current.value!= -1){
      if(current.value==value){
        return current
      }else{
        if(value<current.value)
          current = current.left
        else
          current = current.right
      }
    }
    null
  }

  def transplant(x:Node,y:Node){//把y节点为根的子树放到以x为根的子树上
    if(root.eq(x))
      root = y
    else if(x.eq(x.parent.left))
      x.parent.left = y
    else
      x.parent.right = y
    //if(y!=null&&y.value!= -1)
    y.parent = x.parent
  }

}

object RbTree{

  def apply(): RbTree = new RbTree()
}
