package fileDemo

import java.io.{FileWriter, PrintWriter}

import scala.io.Source
import scala.util.matching.Regex

object Task {

  def main(args: Array[String]): Unit = {
    //flipFile()
    tabFile()
  }

  def flipFile(): Unit ={
    val s = Source.fromFile("C:\\Users\\Administrator\\Desktop\\test.txt","UTF-8")
    val fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\test.txt",true)
    val iterator = s.getLines()
    val array = iterator.toArray
    val reverse = array.reverse
    println(array.mkString(","))
    println(reverse.mkString(","))
    reverse.foreach(str=>{println(str);fw.write(str)})
    fw.flush()
    fw.close()
    s.close
  }

  def tabFile(): Unit ={
    val source = Source.fromFile("C:\\Users\\Administrator\\Desktop\\test.txt","UTF-8")
    val fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\test.txt",true)
    val pw = new PrintWriter(fw,true)
    val it = source.getLines()
    val regex = "\t".r
    it.foreach(str=>{
      println(it.length)
      val n = regex.replaceAllIn(str,"x")
      println(n)
      pw.println(n)
    })
    pw.flush()
  }

}
