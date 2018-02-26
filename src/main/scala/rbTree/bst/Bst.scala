package rbTree.bst

sealed abstract class Bst[+T<% Comparable[T]] {

  def value:T//这里改成泛型
  def left:Bst[T]
  def right:Bst[T]
  def isEmpty:Boolean

  def insert[B >: T<% Ordered[B]](newValue:B):Bst[B] = {

    if(isEmpty)
      Branch(newValue,None,None)
    else if(newValue.compareTo(value) < 0)
      Branch(value,left.insert(newValue),right)
    else
      Branch(value,left,right.insert(newValue))
  }

  //真是天才
  def remove[B >: T<% Ordered[B]](target:B): Bst[B] ={
    //val findval = this.value
    target match {
      case _  if target==this.value => this match {//找到要删除的节点，执行删除操作
        case Branch(_,None,None) => None
        case Branch(_,l:Branch[T],None) => l
        case Branch(_,None,r:Branch[T]) => r
        case Branch(_,l:Branch[T],r:Branch[T]) =>
          val successor = r.min()
          Branch(successor.value,l,r.remove(successor.value))
      }
      case _ if target.compareTo(this.value)<0  =>Branch(value,left.remove(target),right)
      case _ => Branch(value,left,right.remove(target))
    }
  }

  def min():Bst[T] ={
    this.left match {
      case _:Branch[T] => this.min()
      case _:None.type => this
    }
  }

}

case object None extends Bst[Nothing]{
  override def value = throw new UnsupportedOperationException()
  override def left: Bst[Nothing] = null
  override def right: Bst[Nothing] = null
  override def isEmpty: Boolean = true
}

case class Branch[T<% Comparable[T]](override val value:T,override val left:Bst[T],override val right: Bst[T]) extends Bst[T]{
  override def isEmpty: Boolean = false
}

object Bst{
  def printTree(tree:Bst[_<:AnyVal]): Unit ={
    if(!tree.isEmpty){
      printTree(tree.left)
      println(tree.value)
      printTree(tree.right)
    }
  }
}
