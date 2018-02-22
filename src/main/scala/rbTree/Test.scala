package rbTree

object Test {

  def main(args: Array[String]): Unit = {
    val rbTree = RbTree()
    rbTree.insert(Node(3))//如果给定的构造函数有默认值的话，你传入的第一个参数会去匹配构造函数的第一个参数，无论他是否有默认值
    rbTree.insert(Node(7))
    rbTree.insert(Node(0))
    rbTree.insert(Node(4))
    rbTree.insert(Node(5))
    rbTree.insert(Node(2))
    rbTree.peek()
    rbTree.left_rotate(rbTree.root)
    println("===")
    rbTree.peek()
  }

  def add(a:Node = null,b:Int = 2)={
    a
  }

}
