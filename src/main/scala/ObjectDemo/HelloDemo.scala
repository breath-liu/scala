package ObjectDemo

/**
  * Created by Administrator on 2018/1/8.
  */
object HelloDemo extends App{//通过继承App的方法实现main函数的功能
  for(i<-args.indices.reverse){//indices返回数组的索引range
    println("============"+args(i))
  }
  var i = 1+9
  println(i)
}
