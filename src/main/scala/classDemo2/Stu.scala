package classDemo2

/**
  * Created by Administrator on 2018/1/8.
  */
class Stu private(var id: Int, var name: String) {
  override def toString: String = id+":"+name

}

object Stu {
  var stu = new Stu(0,"")
  def apply(id: Int, name: String):Stu={
    stu.name = name
    stu.id = id
    stu
  }


}
