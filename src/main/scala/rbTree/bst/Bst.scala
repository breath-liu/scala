package rbTree.bst

sealed abstract class Bst[T](implicit ev:T => Comparable[T]) {

  def value:T//这里改成泛型
  def left:Bst[T]
  def right:Bst[T]
  def isEmpty:Boolean

  def insert(newValue:T):Bst[T] = {

    if(isEmpty)
      Branch(newValue,None,None)
    else if(newValue.compareTo(value) < 0)
      Branch(value,left.insert(newValue),right)
    else
      Branch(value,left,right.insert(newValue))
  }

  //真是天才
  def remove(target:T): Bst[_<:T] ={
    //val findval = this.value
    target match {
      case _  if target==this.value => println(s"yes ${this.value}"); this match {//找到要删除的节点，执行删除操作
        case Branch(_,None,None) => None
        case Branch(_,l:Branch[T],None) => println("zuo");l
        case Branch(_,None,r:Branch[T]) => println("you");r
        case Branch(_,l:Branch[T],r:Branch[T]) =>
          val successor = r.min()
          println(r.value+"====左右")
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

case class Branch[B](override val value:B,override val left:Bst[_<:B],override val right: Bst[_<:B]) extends Bst[B]{
  override def isEmpty: Boolean = false
}

object Bst{
  import Ordering._
  import Ordered._
  def printTree(tree:Bst[_<:AnyVal]): Unit ={
    if(!tree.isEmpty){
      printTree(tree.left)
      println(tree.value)
      printTree(tree.right)
    }
  }

}
