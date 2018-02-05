package typeDemo.task

class Pair[T,S](val first:T,val second:S) {

  def swap(): Pair[S,T] ={
    new Pair(second,first)
  }

  def swap2()(implicit ev:S=:=T):Pair[S,T] ={
    new Pair(second,first)
  }


  override def toString = s"Pair($first, $second)"

}

object Pair{

  def swap[T,S](pair:Pair[T,S]): Pair[S,T] ={
    new Pair(pair.second,pair.first)
  }

}
