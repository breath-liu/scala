package implicitDemo

class Pair[T:List](val first:T,val second:T) {//上下文界定

  def smaller(implicit order:List[T]){
    //list.mkString(",")
  }

}
