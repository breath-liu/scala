package operatorDemo

class BigSeq {
  var seq:Seq[Int] = null
  def this(seq:Int*){
    this()
    this.seq = seq
  }

  override def toString: String = {
    val l = java.lang.Long.parseLong(seq.mkString,2)
    l.toString
  }

}

object BigSeq{
  def apply: BigSeq = new BigSeq()
  def update(seq:Int*) ={
    new BigSeq(seq:_*)
  }
}
