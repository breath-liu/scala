object BigData {

  def main(args: Array[String]): Unit = {
    val votes = Seq(("scala", 1), ("java", 4), ("scala", 10), ("scala", 1), ("python", 10))
    println(votes.groupBy(_._1).map(t=>(t._1,t._2.foldLeft(0)(_+_._2))).toSeq.sortBy(_._2).mkString(","))
  }

}
