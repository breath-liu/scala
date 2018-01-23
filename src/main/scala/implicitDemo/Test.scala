package implicitDemo

import java.io.File

import scala.io.Source

object Test {

  def main(args: Array[String]): Unit = {
    println(strToArr(3).mkString(","))
    new File("readme").read()
  }
  implicit def file2Rich(form:File):RichFile=new RichFile(form)//隐式转换要定义在方法调用之前或者显示定义返回值类型

  implicit def strToArr(str:Int) = Array(str,str)

}

class RichFile(val from:File){
  def read()={
    Source.fromFile(from)
  }
}
