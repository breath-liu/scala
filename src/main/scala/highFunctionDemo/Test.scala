package highFunctionDemo

import java.awt.event.ActionListener

object Test {

  def main(args: Array[String]): Unit = {
    val f:(List[Int],String)=>String = _ mkString _//声明函数
    val fun:(String,Int)=>Char = _.charAt(_)
    val fun3 = (a:String,b:Int)=>a.charAt(b)//另一种声明方式
    var list = List(1,2,3)
    println(f(list,","))//调用函数

    val fun2:Int=>Int = _+1//只能用val ???
    println(fun2(2))

    println(mulBy2(2)(3))
    println(increase((a,b)=>a+b))//正常点的写法
    println(increase(_+_))

    val listener:ActionListener = event=>println(1)//等于创建了一个ActionListener类型的对象
    val run:Runnable = ()=>println("aa")

    val muBy3 = (x:Int)=>(y:Int)=>x*y//柯里化函数表现形式
    val divide = (_:Int)/10

    println("============")
    var x = 6
    until(x==0){
      x-=1
      println(x)
    }
  }

  def mulBy(a:Double) = (b:Double)=>a*b
  def increase(f:(Int,Int)=>Int) = f(2,2)
  def mulBy2(a:Double)(b:Double)=a*b//柯里化方法表现形式


  def until(condition: =>Boolean)(block: =>Unit){//换名调用 control abstraction
    if(!condition){
      block
      until(condition)(block)
    }
  }

}
