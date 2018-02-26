package rbTree.bst

object Test {

  def main(args: Array[String]): Unit = {
    import Ordering._
    val fun:(String,Int)=>Char = _.charAt(_)
    //implicit val a:(Int)=>Ordered[Int]= _+0//_代表给变量附上缺省值，0，false,null,只能用于给var赋值，不然会报unbound placeholder paramerter
    val branch = Branch(10,None,None)
    val bst = branch.insert(3).insert(5).insert(0).insert(9)
    Bst.printTree(bst)
    println("====")
    Bst.printTree(bst.remove(3))
  }


}
