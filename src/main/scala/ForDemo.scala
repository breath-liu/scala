import scala.util.control.Breaks

/**
  * Created by Administrator on 2018/1/2.
  */
object ForDemo {
  def main(args: Array[String]): Unit = {
    var a : Int = 2//指定类型
    var b = 3 //类型推倒
    for (a <- 1 to 10){//从1到10，包含10
      print(a+",")
    }

    println()

    for (c <- 1 until 10){//从1到10，不包含10 好像可以不提前声明c,也能运行
      print(c+",")
    }

    println()
    for(d <- 1 to 3; e <- 1 to 3){//感觉是双重for循环的另一种写法？但是无法控制内外层循环
      print(e+",")
    }

    println()
    var list = List(5,4,3,2,1)
    println(list)
  /*  for (f <- list.length){
      for (g <- 0 to f){
        //continue...
      }
    }
*/
    var list2 = for (c <- list
      if c!=3 && c <4
    )yield c//可以将for循环的返回值作为一个变量来存储

    println(list)
    println(list2)
    val loop = new Breaks//scala里没有break关键字，使用下面的语法可以实现break的功能
    loop.breakable{
      for (c <- list){
        if (c==4)//类似c和java如果括号里只有一条语句，括号可以省略
          loop.break()
        print(c)
      }
    }
    println()

    for(c <- list){//类似地，也没有continue,据说这就是函数式编程思想[费解]，[费解]
      loop.breakable{
        if (c==4)//类似c和java如果括号里只有一条语句，括号可以省略
          loop.break()
        print(c)
      }
    }

  }

}
