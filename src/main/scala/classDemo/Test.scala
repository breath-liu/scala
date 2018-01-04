package classDemo

/**
  * Created by Administrator on 2018/1/4.
  */
object Test {
  def main(args: Array[String]): Unit = {
    val p = new Person
    println(p.name)

    p.name_=("john")//setter 方法
    p.name = "john"//setter 方法 其实也是调用name_
    println(p.name)//getter方法

    var comm = p.getComment()//写不必要的括号
    println(comm)
    p.setComment("aabc")
    comm = p.getComment
    println(comm)

    //=======================================================
    val item = new Item("item",12.3)

  }
}
