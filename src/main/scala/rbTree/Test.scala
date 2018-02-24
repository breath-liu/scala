package rbTree

import scala.collection.immutable.TreeSet

object Test {

  def main(args: Array[String]): Unit = {
    /*val rbTree = RbTree()
    rbTree.insert(Node(3))//如果给定的构造函数有默认值的话，你传入的第一个参数会去匹配构造函数的第一个参数，无论他是否有默认值
    rbTree.insert(Node(7))
    rbTree.insert(Node(0))
    rbTree.insert(Node(4))
    rbTree.insert(Node(5))
    rbTree.insert(Node(2))
    //rbTree.insert(Node(10))
    //rbTree.insert(Node(20))
    //rbTree.insert(Node(30))
    rbTree.peek()
    rbTree.delete(7)
    println("==")
    rbTree.peek()*/
    var treeSet = TreeSet(1,2,34,5)
    treeSet+=10
    println(treeSet.toString())
  }

  def add(a:Node = null,b:Int = 2)={
    //val i:Int = null
  }

}
