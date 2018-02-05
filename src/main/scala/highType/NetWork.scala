package highType

import scala.collection.mutable.ArrayBuffer

class NetWork {

  val members = new ArrayBuffer[Member]()

  class Member(val name:String){
    val contract = new ArrayBuffer[NetWork#Member]()//类型投影，接受所有Network类型的member


    def canEqual(other: Any): Boolean = other.isInstanceOf[Member]

    override def equals(other: Any): Boolean = other match {
      case that: NetWork#Member => //匹配模式可以判断两个对象的类型是否相同
        println("yes")
        println(that)
        (that canEqual this) &&
          name == that.name
      case _ =>
        println("no")
        false
    }

    override def hashCode(): Int = {
      val state = Seq(name)
      state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
    }
  }

  def join(name:String) = {
    val member = new Member(name)
    members+=member
    member
  }



}
