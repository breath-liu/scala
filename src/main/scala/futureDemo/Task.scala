package futureDemo


import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success, Try}//线程池

object Task {

  def main(args: Array[String]): Unit = {
    for(n1 <- Future{Thread.sleep(2000);println(Thread.currentThread().getName+"1111");1};//两个future是先后顺序执行的，对println的调用发生在内层循环线程中
        n2 <- Future{println(Thread.currentThread().getName+"222");3} ){
      println(Thread.currentThread().getName)
      println(n1+n2)
    }
    val order = doInOrder(x=>Future.successful(x+"abc"),s=>Future.successful(s.charAt(1)))
    println(order(50))
    Thread.sleep(5000)
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
