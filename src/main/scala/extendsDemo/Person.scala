package extendsDemo

import scala.beans.BeanProperty

/**
  * Created by Administrator on 2018/1/9.
  */
abstract class Person {
  @BeanProperty var name = "tom"


  def generateId:Int//声明抽象方法

  def gName = name

  def vname_= (aa:String):Unit={//在定义一个返回方法的函数时等号前不能写空格，不知道为啥
    name=aa
  }

  def vname = name

  def range:Int = 10
  val env:Array[Int] = new Array[Int](range)
}


