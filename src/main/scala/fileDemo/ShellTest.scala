package fileDemo

import scala.sys.process._

object ShellTest extends App {

  val value: String = "ipconfig".!!
  println(value)
//  private val builder: ProcessBuilder = "ipconfig"#|"grep DNS"

//  println(builder.!!)

 // Process("")

}
