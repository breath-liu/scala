package extendsDemo

import java.nio.charset.Charset
import java.nio.file.{Files, Path}

/**
  * Created by Administrator on 2018/1/9.
  */
class PathWriter(p:Path,cs:Charset) extends java.io.PrintWriter(Files.newBufferedWriter(p,cs)){

}
