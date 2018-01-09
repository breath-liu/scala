package extendsDemo

import scala.beans.BeanProperty

/**
  * Created by Administrator on 2018/1/9.
  */
class Person {
  @BeanProperty var name = "tom"

  def gName = name

  def vname_= (aa:String):Unit={//在定义一个返回方法的函数时等号前不能写空格，不知道为啥
    name=aa;
  }

  def vname = name



}


