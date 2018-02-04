package typeDemo

class Student(name:String,age:Int) extends Person(name,age) {
  var score:Double = 0.0

  def this(name:String,age:Int,score:Double){
    this(name,age)
    this.score = score
  }

}
