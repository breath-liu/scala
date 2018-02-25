package typeDemo

class Comp[T](val first:T,val second:T)(implicit ev:T=>Comparable[T]) {//用类型约束来界定 需要一个隐式转换

  def third:T ={first}
  def smaller(): T ={
    //ev.ensuring()
    third.compareTo(second)
    first.compareTo(second) match {
      case x if(x>0) => second
      case _ => first
    }
  }
}
