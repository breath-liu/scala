import scala.collection.mutable.{ArrayBuffer, ListBuffer, Set, Stack}
/**
  * Created by Administrator on 2018/1/3.
  */
object CollectionDemo2 {
  def main(args: Array[String]): Unit = {
    val set = Set(1,2,3)
    val arr = Array(1,2,3,4)
    var arrbuf = ArrayBuffer(1,2,3)//mutable类型的集合可以用+=操作
    arrbuf+=4//+=用于向数组最后追加元素
    arrbuf+=(5,6)//+=也可以追加多个元素
    arrbuf++=arr//++=用于追加另一个集合
    val list = 1::2::Nil
    println(list.mkString(","))

    val map = Map("k1"->"v1","k2"->1.0,"k3"->"v3")
    map+("k4"->"v4")
    map.foreach(e=> {//遍历方式1 可以看到map的k,v其实是一个个元组
      val (k,v)=e;
      println(k+":"+v)})

    map.foreach(e=> println(e._1+":"+e._2))//遍历方式2

    var sq = (x:Int)=>x*x//有点函数式编程的意思了
    val res = sq(5)
    println(res)

    val tup = ("hello","world",113)//元组
    println(tup._1)
    println(tup._2)
    println(tup._3)

    val (fir,sec,thi) = tup//通过模式匹配获取元组内容
    println(thi)
    println("==========================")
    new Stack[Int]()//过时啦
    var l = ListBuffer("1",2)
    l.append("3")
    l.+=:(5)//头部追加 不是可以省略点号的吗，不懂这里为啥不能省略
    l = l.tail
    println(l.mkString(","))
  }
}
