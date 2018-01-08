package classDemo2

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Administrator on 2018/1/8.
  */
class OutterClass {

  class Inner(var name:String){
    var buf = new ArrayBuffer[OutterClass#Inner]//类型投影
    buf+=this

    override def toString: String = name
  }

}

object OutterClass{//伴生对象
  class InnerC(var name:String){
    println("伴生对象方法")
    var buf = new ArrayBuffer[InnerC]
    buf+=this
    override def toString: String = name
  }
}

