package extendsDemo

/**
  * Created by Administrator on 2018/1/9.
  */
object Test {
  def main(args: Array[String]): Unit = {
    val p = new Person{//创建匿名子类
      override def generateId: Int = 5
    }
    val name = p.gName
    println(name)

    val s = new Student
    //s.gName = "new"
    println(s.gName)
    println(s.name)

    val c = s.vname(2)//这种方法是取出vname变量下标为2的字符
    s.vname = ("ccc")
    println(s.vname)

    println(p.env.length)//10
    println(s.env.length)//0
  }
}

