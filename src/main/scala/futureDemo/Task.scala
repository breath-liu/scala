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

}


