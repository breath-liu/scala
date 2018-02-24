package rbTree.bst

sealed abstract class Bst[+T] {

  def value:Int//这里改成泛型
  def left:Bst[T]
  def right:Bst[T]
  def isEmpty:Boolean

  def insert(newValue:Int):Bst[T] = {
    if(isEmpty)
      Branch(newValue,None,None)
    else if(newValue< value)
      Branch(value,left.insert(newValue),right)
    else
      Branch(value,left,right.insert(newValue))
  }

  //真是天才
  def remove(target:Int): Bst[T] ={
    //val findval = this.value
    target match {
      case _  if(target==this.value) => println(s"yes ${this.value}"); this match {//找到要删除的节点，执行删除操作
        case Branch(v,None,None) => None
        case Branch(_,l:Branch[T],None) => l
        case Branch(_,none,r:Branch[T]) => r
        case Branch(_,l:Branch[T],r:Branch[T]) =>
          val successor = r.min()
          Branch(successor.value,l,r.remove(successor.value))
      }
      case _ if(target<this.value)=>Branch(value,left.remove(target),right)
      case _ => Branch(value,left,right.remove(target))
    }
  }

  def min():Bst[T] ={
    this.left match {
      case b:Branch[T] => this.min()
      case n:None.type => this
    }
  }

}

case object None extends Bst[Nothing]{
  override def value: Int = -1
  override def left: Bst[Nothing] = null
  override def right: Bst[Nothing] = null
  override def isEmpty: Boolean = true
}

case class Branch[T](override val value:Int,override val left:Bst[T],override val right: Bst[T]) extends Bst[T]{
  override def isEmpty: Boolean = false
}

object Bst{
  def printTree(tree:Bst[AnyVal]): Unit ={
    if(!tree.isEmpty){
      printTree(tree.left)
      println(tree.value)
      printTree(tree.right)
    }
  }

}
