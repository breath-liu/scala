/**
  * Created by Administrator on 2018/1/2.
  */
object FunctionDemo {
  def main(args: Array[String]): Unit = {
    //var c = add(2,3)
    //c = add(b = 3,a = 2)//也可以指定参数名调用函数 btw:python也支持这样的调用方式
    //println(c)
    printArr("aa",1,2,3,4,6)
    printArr("",1 to 5:_*)//如果希望函数接受这种方式的参数传递，需要在末尾加上_*声明他是一个序列
    var result:Int = factorial(5)
    println(result)
    println(42.asInstanceOf[AnyRef])

    val fun = (x:Int)=>{
      if(x>0)
        1
      else if(x==0)
        0
      else
        -1
    }
    println(fun(2))
  }

  def add(a:Int,b:Int): Int = {//定义一个function
    val sum = a+b
    println("a:"+a+",b:"+b)
    return sum//这种书写方式反而会出现编译警告，scala推荐你使用类型推导方式
  }

  def printArr(b:String,arrs:Int*): Unit ={//定义一个可以接受可变长度的参数，和java的语法类似，可变参数必须放到最后
    println(b)
    for(i <- arrs){
      print(i+",")
    }
  }

  def factorial(n:Int): Int ={//递归阶乘 递归函数必须指明返回值类型！！！
    if (n<=1)
      1
    else
      return n * factorial(n-1)
  }

  def add(a:Int = 2){//为函数指定默认值
    println(a)
  }
  //
}
