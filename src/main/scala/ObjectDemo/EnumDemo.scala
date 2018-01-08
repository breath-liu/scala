package ObjectDemo

/**
  * Created by Administrator on 2018/1/8.
  */
object EnumDemo extends Enumeration{//value id不可重复
  type Test = Value//增加类型别名
  val Red,Yellow,Green = Value("a")

  def main(args: Array[String]): Unit = {
    println(s"${Red.id}:$Red")//再用插值器时，除非直接引用变量，其他情况都要加括号
    println(s"${Yellow.id}:$Yellow")
    cat(Green)
  }

  def cat(color:Test): Unit ={
    println(s"${color.id}:$color")
  }

}
