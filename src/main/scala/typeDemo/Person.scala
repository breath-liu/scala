package typeDemo

class Person(val name:String,val age:Int) extends God with Friend [Person] {

 /* override def beFriend(someone: Person){
    //println(s"$this  $someone")
  }
*/
  override def beFriend(someone: God): Unit = super.beFriend(someone)
}
