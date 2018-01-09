package extendsDemo

import scala.beans.BeanProperty

/**
  * Created by Administrator on 2018/1/9.
  */
class Student extends Person{
  override val gName: String = "stu" //用val重写一个不带参数def
  //不能重写非抽象父类型var变量
  //override var vname: String = "vname"//用var重写set,get方法

  override def vname_=(aa: String): Unit = super.vname_=(aa)//def只能重写def
  override def generateId: Int = {
    var i = 5
    i+i
  }

  override val range: Int = 2
}

