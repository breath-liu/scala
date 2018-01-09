package classDemo2

class Counter {
  private var value = 0;//必须初始化成员变量

  private var age = 0//自动生成age与age_（setter）方法

  def increment() = value+=1

  def current = value

 /* def age_=(newage:Int){//自定义setter方法 不能这样直接重写方法，因为会隐式生成一个age_函数，回报重复定义错误
    println("custom function")
    age = newage
  }*/
}
