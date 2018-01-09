package packageDemo

/**
  * Created by Administrator on 2018/1/9.
  */
object Test {

  def main(args: Array[String]): Unit = {
    val random = Random(20)
    println(random.nextInt())
    val r1 = new java.util.Random
    r1.setSeed(20)
    val i = r1.nextInt()
    println(i)
  }

}
