package matchDemo

object Task {

  def main(args: Array[String]): Unit = {
    println(swap((1,2)))
    println(swap(Array(1,2,3,4)).mkString(","))
    val l = Some(5)::None::Some(2)::Nil
    println(count(l))
    println(leafSum((3::8::Nil)::2::(5::Nil)::Nil,0))
  }

  def swap(tup:(Any,Any)):(Int,Int)={
    tup match {
      case (x:Int,y:Int) =>(y,x)
      case _=>null
    }
  }

  def swap(arr:Array[Int]):Array[Any]={
    arr match {
      case _ if(arr.length>2)=> Array(arr(1),arr(0))++arr.drop(2)//take获取前n个元素，drop丢弃前n个元素
      case Array(x,y,rest @_*) => Array(y,x,rest)
    }
  }

  def count(list:List[Option[Int]]):Int={
    (0/:list){
      (x,y)=>{
        if(y.isEmpty) x else x+y.get
      }
    }
  }

  def leafSum(list:List[Any],init:Int): Int ={
    (init/:list){
      case (x:Int,y:Int) => x+y
      case (x:Int,y:List[Any]) => leafSum(y,x)//尾递归，最后一句是函数调用
      case other => other._1
    }
  }
}

