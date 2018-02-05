package highType

import scala.collection.immutable.Range
import scala.collection.mutable
import scala.language.existentials
object Test {



  def main(args: Array[String]): Unit = {
    type NetWorkMember = n.Member forSome {val n:NetWork}//不懂 ，为什么定义在方法外会识别不了
    type NetworkMember = n.Member forSome { val n: NetWork }
    def process(m1: NetworkMember, m2: NetworkMember): Unit ={

    }
    def process2(m1:NetWorkMember,m2:NetWorkMember): Unit ={

    }
    val append = (str:String)=>{}
    structType(new App())

    //val list:Int List Int = List(2,3)//中置类型 可以看到，如果类的泛型参数是两个的话，则可以使用中置表达式进行变量的定义。中置类型最常用的场景是模式匹配，
    //val map2 = String mutable.HashMap Int

    type x[A,B] = (A,B)
    val t1:Int x Int = (1,2)

    val bugsy = new Bug()
    bugsy.move(5).show.move(6).show.turn.move(5).show

    val net_a = new NetWork
    val net_b = new NetWork
    val member_a = net_a.join("baidu")
    val member_b = net_b.join("baidu")
    member_a.contract+=member_b

    println(member_a == member_b)
    println(member_a.getClass == member_b.getClass)
    println(member_a.equals(member_b))
    //println(classOf[])

    //process(member_a, member_b)
    //process2(member_a,member_a)
    val chatter = new NetWork
    val myFace = new NetWork
    val fred = chatter.join("Fred")
    val wilma = chatter.join("Wilma")
    val barney = myFace.join("Barney")
    //process(fred, wilma) // OK  接受相同网络的成员  实际是可以编译通过的，ide对scala的支持不太智能
    //process(fred, barney) // OK 接受不同网络的成员

    println(findIndex(Array(1,3,5,7,9),4))
  }

  def structType(target:{def append(str:String)}): Unit ={//结构类型,需要传入一个内部定义有append方法的对象
    target.append("")
  }


  def process[M<:n.Member forSome {val n:NetWork}](m1:M,m2:M): Unit ={//存在类型

  }

  def printValues(f:{def apply(in:Int):Int},from:Int,to:Int): Unit ={
    for(i<-from to to){
      println(f.apply(i))
    }
  }

  def findIndex(arr:Array[Int],key:Int):Int Either Int={
    if(arr.contains(key)){
      Right(arr.indexOf(key))
    }else{
      println("============")
      arr.foldLeft(0)((a,b)=>{
        println(a)
        println(b)
        println("================")
        a+b
      })
      println("============")
      Left(arr.indexOf(arr.filter(_>key).head))

    }
  }

  class App{
    def append(str:String): Unit ={

    }
  }

}
