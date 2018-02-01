object QuickSort {


  def main(args: Array[String]): Unit = {
    val list = 11::1::3::5::7::9::2::4::6::8::10::Nil
    println(quickSort(list).mkString(","))
    val l1 = 1::2::3::Nil
    val l2 = 5::6::7::Nil
    println((l1:::4::l2).mkString(","))//:是右连接的，要反着读
  }

  def quickSort(list: List[Int]): List[Int] = {
    val res = list match {
      case Nil => Nil
      case head::tail =>
        val tuple = tail.partition(_<head)
        quickSort(tuple._1):::head::quickSort(tuple._2)
      case _ => Nil
    }
    res
  }
}
