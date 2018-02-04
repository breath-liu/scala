package futureDemo

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.Success

object Task {

  def main(args: Array[String]): Unit = {
    val together = doOrderTogether(x=>Future{
      Thread.sleep(200)
      println("f1")
      x+"abc"
    })(y=>Future{
      //Thread.sleep(5000)
      println("f2")
      y+"def"
    })
    println(together(5).onComplete(println(_)))

    for(n1 <- Future{Thread.sleep(2000);println(Thread.currentThread().getName+"1111");1};//两个future是先后顺序执行的，对println的调用发生在内层循环线程中
        n2 <- Future{println(Thread.currentThread().getName+"222");3} ){
      println(Thread.currentThread().getName)
      println(n1+n2)
    }
    val order = doInOrder(x=>Future.successful(x+"abc"),s=>Future.successful(s.charAt(1)))
    println(order(50))
    Thread.sleep(5000)
  }

  def doOrderTogether(f:Int=>Future[String])(g:Int=>Future[String]): Int=>Future[(String,String)] ={
    x:Int => Future{
      val f1 = f(x)
      val f2 = g(x)
      val future = Await.ready(f1,1000.seconds)
      (f1.value.get, f2.value.get) match {
        case (Success(x),Success(y)) => (x,y)
      }

      /*val res = f1.flatMap(s1=>f2.map(s2=>(s1,s2)))
      Thread.sleep(500)
      res.value.head match {
        case Success(s) => s
      }*/
      //res.onComplete{case Success(s) => s }
    }

  }

  def doInOrder(f:Int=>Future[String],g:String=>Future[Char]):Int=>Future[Char] ={
    //val Success(x:String) = f(_:Int).value.get
    (x:Int) => f(x).value.get match {
      case Success(y) => g(y)
      //case Failure(ex) => g(ex)
    }
    // ""
    // g("")
  }

}


