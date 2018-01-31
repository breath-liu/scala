package implicitDemo

import java.io.File

import scala.io.Source

object Test {

  def main(args: Array[String]): Unit = {
    import RichFile._
    println(strToArr(3).mkString(","))
    //new File("readme").read()
    implicit val imp = new Delimiter("“","”")//会优先使用在当前作用域内能够找到的隐式参数
    println(qoute("a"))
    demo1(_)
    println(demo2("a"))

    implicit val order =  List(0,0)
    val pair = new Pair(1,2)
    //println(pair.smaller)
    2->3
  }
  //implicit def file2Rich(form:File):RichFile=new RichFile(form)//隐式转换要定义在方法调用之前或者显示定义返回值类型

  implicit def strToArr(str:Int) = Array(str,str)

  def qoute(what:String)(implicit del:Delimiter)={
    del.left+what+del.right
  }

  def demo1(fun:String=>Ordered[String])={
    1
  }

  def demo2(what:String)(implicit trans:Delimiter=>Serializable)={
    what
  }


}
