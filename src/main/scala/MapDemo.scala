/**
  * Created by Administrator on 2018/1/5.
  */
import scala.collection
object MapDemo {

  def main(args: Array[String]): Unit = {
    val map = Map("k1"->"v1","k2"->"v2")
    val map1 = map.withDefault(k=>k+" not found")//传入默认的function 返回一个不可变的Map
    val map2 = map.withDefaultValue("none")//传入默认的value
    println(map1("k1"))//不太懂这个是什么语法
    println(map1("k3"))
    //==========================================
    println(map2("k1"))
    println(map2("k3"))

    val mutableMap = collection.mutable.Map("k1"->"v1","k2"->"v2")
    mutableMap("k1") = "new v1"//修改
    println(mutableMap("k1"))
    mutableMap+=("k3"->"v3")
    mutableMap-="k1"
    println(mutableMap)

    for (e<-mutableMap){
      println(e._1+":"+e._2)
    }
    mutableMap.foreach(e=>{val(k,v)=e;println(k);println(v)})
  }

}
