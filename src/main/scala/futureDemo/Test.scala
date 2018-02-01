package futureDemo

import java.time.LocalTime

import scala.collection.mutable.ListBuffer
import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Test {

  def main(args: Array[String]): Unit = {
    /*val f = Future{
      //Thread.sleep(2000)
      //println(s"current time is ${LocalTime.now()}")
      for (i<-1 to 100){
        println(s"A")
        //Thread.sleep(10)
      }
    }*/
    /*Future{
      //Thread.sleep(2000)
      //println(s"current time is ${LocalTime.now()}")
      for (i<-1 to 10000){
        println(s"b$i")
        //Thread.sleep(1)
      }
    }*/
    import duration._
    //Await.ready(f,10.seconds)
    //Thread.currentThread().setDaemon(true)
    val f2 = Future{
      var second = LocalTime.now().getSecond
      second = 13
      if(second%2==0)
        second
      else
        throw new IllegalArgumentException(s"$second")
    }
    val future = Await.ready(f2,200.seconds)
   /* future.value match {
      case Some(Success(x)) => println(x)
      case Some(Failure(y)) => println(y)
    }*/
    f2.foreach(x=>println(s"${x}xxx"))//当任务执行失败时future里不会存失败的任务结果
    f2.recover{case e:Throwable =>println("exception"+e);99}.foreach(x=>println(x+"xx"))
    f2.onComplete{
      case Success(x) => println(x)
      case Failure(x) => println(x)
    }
    println(s"current time is ${LocalTime.now()}========")

    /*val res = "-3+4".map{//在不接受偏函数的的方法中要列举出全部的case,不然会报MatchError
      case '+' => 1
    }*/

   // println(res)
    val seq = Future.traverse(ListBuffer(1,2,3,4))(x=>Future{x+1})//分别执行每个future
    seq.foreach(println)
    val futures = List(1,2,3).map(x=>Future{x+1})
    println(Future.firstCompletedOf(futures).value)
    Future{Thread.sleep(2000);println("hello")}//查到第一个完成的future
    Future.find(futures)(_>3)
    val eventualInt = Future.successful(10)//手动创建一个完成的future
    println(eventualInt)

    val p = Promise[String]
    Future{
      val time = LocalTime.now()
      p.success(time.toString)
      //p.future
      val Success(x) = p.future.value.get
      println(x)
    }

    Thread.sleep(5000)

  }

}
