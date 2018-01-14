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

    println(ori.matches("([\\$[0-9],?])+"))


    val mutiPartten = "([0-9]+)([a-z]+)".r//正则表达式组
    val matches2 = mutiPartten.findAllMatchIn("9a3 abc 10def")
    matches2.foreach(m=>println(m.matched))
  }

}
