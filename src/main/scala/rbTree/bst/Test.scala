package rbTree.bst

object Test {

  def main(args: Array[String]): Unit = {
    val branch = Branch(10,None,None)
    val bst = branch.insert(3).insert(5).insert(0).insert(9)
    Bst.printTree(bst)
    println("====")
    Bst.printTree(bst.remove(3))
  }

}
