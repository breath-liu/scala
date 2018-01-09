package packageDemo

import java.util.{HashMap=>java_map}
import collection.mutable.{HashMap=>scala_map}
import scala.collection.JavaConverters._

/**
  * Created by Administrator on 2018/1/9.
  */
object CopyMap extends App{//编写一段程序,将Java哈希映射中的所有元素拷贝到Scala哈希映射。用引入语句重命名这两个类。

  private val java_map = new java_map[String,Object]
  java_map.put("k1","v1")
  java_map.put("k2","v2")
  java_map.put("k3","v3")

  private val scala_map = new scala_map[String,Object]
  private val scala = java_map.asScala
  scala.foreach(e=>scala_map+=(e._1->e._2))

  println(scala_map)

}
