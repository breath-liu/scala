/**
  * Created by Administrator on 2018/1/3.
  */
object CollectionDemo {

  //认识::,:+,+:,++,:::的联系与区别
  //list是元素（！！！！）不可变的数组
  def main(args: Array[String]): Unit = {
    val list = List(2,3,1,4)
    val nums = 1::2::3::4::Nil
    val num2 = Nil:+0
    val num3 = nums:::num2


    //==========
    //list常用方法的使用

    //判断是否为空
    var bool = num3.isEmpty
    //取头元素
    var head = num3.head
    //取除第一个元素外剩余的元素，返回的是列表
    val tail = num3.tail
    //取除最后一个元素外的元素，返回的是列表| 诡异的命名规则......
    var init = num3.init
    //取尾元素
    var last = num3.last
    //删除第一个元素，返回一个列表/ 诡异得点号省略模式:),装x专用？
    val num4 = num3 drop 1
    //获取前N个元素
    val num5 = num3.take(2)
    print(num5.mkString)

    val char1 = List.apply('h','e','l')
    val list1 = char1.zip(num3)

   // List.make(5, "hey")
    print(list1.mkString)
  }

}
