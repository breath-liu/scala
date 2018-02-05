package typeDemo.task

import typeDemo.{God, Person}

object Task {

  def main(args: Array[String]): Unit = {
    val pair = new Pair("2",2.3)
    println(pair.swap())

    println(Pair.swap(pair))
    val it = List(1,2,3,4,5)
    it.min
    /*while (it.hasNext){
      println(it.next())
    }*/
    //println(middle(it))
    println(middle("aaa"))

    //new Person("")
    //new typeDemo.Pair()
    val p2 = new Pair(2,20)
    println(p2.swap2())

    //val t = new Task.type

    //println(Task.super)

    set(Task)






  }

  /*def middle[T](it:Iterator[T]): T ={

    it.next()
  }*/

  def middle[T](it: Iterable[Char]): Any = {
    def list = it.toList
    //it.foldLeft()
    list(list.size / 2)

  }

  def set(task:Task.type ): Unit ={
    println(task)
  }

}
