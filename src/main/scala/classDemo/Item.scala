package classDemo

/**
  * Created by Administrator on 2018/1/4.
  */
class Item () {//使用主构造器来初始化对象 private将主构建器设置为私有

  var name:String =_
  var price:Double = 0

  def this(name:String,price:Double){
    this()
    this.name = name
    this.price = price
  }
}
