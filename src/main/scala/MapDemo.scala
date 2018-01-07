/**
  * Created by Administrator on 2018/1/5.
  */
import java.util
import scala.collection.JavaConverters._
import scala.collection
import scala.collection.mutable
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


    var vec = for((k,v)<-mutableMap)yield (v,k)//交换kv
    println(vec)

    val sortMap = mutable.SortedMap("c"->1,"a"->2,"b"->3,"c"->4)//类似treeMap 排序与去重
    println(sortMap.mkString(","))

    val m = mapAsScalaMap(new java.util.HashMap[String,String])//java对象与scala对象的转换
    val hashMap = new java.util.HashMap[String,String]//第二种转换方式
    val scala = hashMap.asScala

    //拉练操作
    val keys = Array("k1","kk","kkk")
    val values = Array("v1","v2","vv3")
    val tuples = keys.zip(values)//返回一个内含tuple的Array,
    println(tuples.isInstanceOf[Array[Any]])
    println(tuples)
    println(tuples(1))
    val toMap1 = tuples.toMap
    println(toMap1)

    val tuple = minmax(Array(5,2,6,3))
    println(s"${tuple _1},${tuple _2}")

    println("a".zip("world"))

    println(keys mkString)
  }

  def minmax(arr:Array[Int]) ={
    val min = arr.min
    val max = arr.max
    (min,max)
  }

}
