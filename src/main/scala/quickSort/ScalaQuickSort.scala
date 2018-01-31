package quickSort

object ScalaQuickSort {
  val arr = Array(1,3,5,7,9,2,4,6,8,10)

  def main(args: Array[String]): Unit = {
    val array = arr filter(2 ==)
    println(array mkString(","))
    //println(sortFunctional(arr).mkString(","))
  }

  def sortFunctional(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      println(pivot)
      Array.concat(sortFunctional(xs filter (pivot >)), xs filter (pivot ==), sortFunctional(xs filter (pivot <)))
    }
  }
}
