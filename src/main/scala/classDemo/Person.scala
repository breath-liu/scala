package classDemo

import scala.beans.BeanProperty

/**
  * Created by Administrator on 2018/1/4.
  */
class Person {
  println("init person......")
  println("init2 person......")

  var name:String = _//scala建议成员变量初始化时把null写为_

  private[this] var age = 12//如果成员变量声明为private[this] 便不会生成getter,setter方法

  @BeanProperty var comment:String="评论"//生成实质上的setter与getter方法
}

