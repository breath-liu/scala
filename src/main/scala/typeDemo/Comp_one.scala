package typeDemo

class Comp_one[T:Ordering](val first:T,val second:T) {//使用上下文界定，需要一个隐式类

  def smaller(implicit ev:Ordering[T]): T={
    //println(ev.(second))

    ev.compare(first,second)match {
      case x if(x>0) => second
      case _ => first
    }
  }
}
