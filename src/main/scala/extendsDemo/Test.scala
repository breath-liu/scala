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

    //val c = s.vname(2)//这种方法是取出vname变量下标为2的字符
    s.vname = ("ccc")
    println(s.vname)

    println(p.env.length)//10
    println(s.env.length)//0  理解这个问题的关键在于val env:Array[Int] = new Array[Int](range)这里使用的是def:range 而不是range属性

    var i:Int = 2
    show(1,2)
    //show2(1,2,3)

    println("aa2".##)//##号代表的是生成hashcode

    val author = new Author("tom cat")
    println(author.fristName)
    println(author.lastName)
  }

  def show(o:AnyRef): Unit ={
    println(s"${o.getClass}:$o")
  }

  def show2(o:Int): Unit ={
    println(s"${o.getClass}:$o")
  }

  def desc = ???  //???返回的是Nothing,这样是可以通过编译的，但是调用会报错
}

