package typeDemo

object Execrise {

  def main(args: Array[String]): Unit = {
    val stu1 = new Student("tom",20,0.1)
    val stu2 = new Student("john",20,0.1)
    val pair = new Pair(stu1,stu2)
    //println(makePair(pair))

    val p1 = new Person("teacher",50)
    println(makeFriends(stu1,new God()))
    val god = new God()
    //findFriend(stu1::Nil,god=>god)//协变与逆变只适用于泛型类上，声明出这个类的父子关系伴随泛型而改变,

    //findFriend(stu1::Nil)

    val a = 1
    val b = 2
    //a.max()
    val pair2 = new Pair(stu1,p1)
    pair2.getPair(p1)(stu1=>{
      new Student("john",20,0.1)
      //new God()
      //god
    })
  }

  def makePair(p:Pair[Person])={
    //(p.first,p.second)
  }

  def makeFriends(s:Student,f:Friend[Person])={
    f.beFriend(s)
  }

  def findFriend[A,B](list:List[Student],function1: (A,B)=>(A,B)): Unit ={
    function1

  }

  def findFriend2(it:Pair[Student]): Unit ={
    it.first.study()
    //function1

  }


}
