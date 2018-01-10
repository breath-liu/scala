package extendsDemo

/**
  * Created by Administrator on 2018/1/10.
  */
class Author(val fullname:String) extends AnyVal{//值类 scala定义的9种值类，有8种分别对应java的8种基本类型 据说是为了隐式转换用的
  def fristName = fullname.split(" ")(0)
  def lastName = fullname.split(" ")(1)
}
