import javax.tools.ForwardingFileObject

/**
  * Created by Administrator on 2018/1/4.
  */
object StringDemo {

  def main(args: Array[String]): Unit = {
    val str:String = "Hello_World"

    println(str.length)
    println(str.startsWith("Hell"))
    val sp = str.split("_")
    println(sp(1))

    val map = Map("k1"->"v1","k2"->"v2")
    val v1 = map.get("k1")
    println(two(map.get("k1")))
    //show(map.get("k1"))

    val f = new Foo
    f()//apply的用法

    val list = List(1,2,3)
    list.map{//匹配模式
      case 1=>"a"
      case 2=>"b"
      case 3=>"c"
    }


  }


  def show(x:Option[Int]) =x match{
    case Some(s) => s
    case None => "????"
  }

  val two: PartialFunction[Option[Any], Any] = {
    case Some(s) => s
    case None => "None"
    case _ => "anyone"
  }


  class Foo{
    def apply() = {
      println("==============")
      111
    }
  }



}



