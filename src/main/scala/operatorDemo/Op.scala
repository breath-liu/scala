package operatorDemo

class Op(var i:Int) {
  var j:Int= 0
  def this(i:Int,j:Int){
    this(i)
    this.j = j
  }

  def unary_-() ={//定义一元操作符 +，-，！，~这4个可作为一元操作符
    i+1
  }
}
object Op{
  def update(newValue:Int): Unit ={
    println(newValue)
  }

  def apply(i: Int,j:Int)= new Op(i,j)

  def unapply(arg: Op): Option[(Int,Int)] = {
    Some(arg.i,arg.j)
  }
}
