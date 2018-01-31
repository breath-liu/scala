package implicitDemo

import java.io.File
import scala.io.Source

class RichFile(val from:File) {
  def read() = {
    Source.fromFile(from)
  }
}

object RichFile{
  implicit def file2Rich(file:File) = new RichFile(file)
}