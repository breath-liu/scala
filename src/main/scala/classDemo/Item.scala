package classDemo

/**
  * Created by Administrator on 2018/1/4.
  */
class Item (var brand:String) {//使用主构造器来初始化对象 private将主构建器设置为私有
  println("aaa")
  this.brand = "abc"

  var name:String = ""
  var price:Double = 0

  def this(name:String,price:Double){
    this("aaa")
    this.name = name
    this.price = price
  }
}
