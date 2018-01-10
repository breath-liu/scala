package fileDemo

import scala.util.matching.Regex


object RegexTest {

  def main(args: Array[String]): Unit = {
    val ori = "$1,$2,$3,$4"
    val list = List("tom","jerry","jack","david")
    val regex = "\\$[0-9]".r
    val matches = regex.findAllMatchIn(ori)
    matches.foreach(println(_))

    val newStr = regex.replaceSomeIn(ori,m=>{//部分匹配并替换
      val i = m.matched(1).toString.toInt
      println(i)
      if(i<3){
        Some(list(i))
      }
      else None})
    println(newStr)
  }

}
