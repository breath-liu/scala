package exercise

object exercise {

  case class Person(name:String,age:Int)

  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,4,5)
    val res = arr.reduce((a,b)=>{
      println(f"$a,$b")
      a+b
    })
    val arr2 = arr.map(i=>i+1)
    println(arr.mkString(","))
    println(res)
    println(arr2.mkString(","))

    val ints = arr.flatMap(a=>Map(a->(a+1)))//这个过程就像是先 map, 然后再将 map 出来的这些列表首尾相接 (flatten).
    println(ints.mkString(","))

    val ys = Map("a" -> List(1 -> 11,1 -> 111), "b" -> List(2 -> 22,2 -> 222)).flatMap(_._2)
    println(ys)

    val ys2 = Map("a" -> List(1 -> 11,1 -> 111), "b" -> List(2 -> 22,2 -> 222)).flatMap(a=>{
      a._1
    })
    println(ys2)

    Seq(Person("a",2))

  }

}
