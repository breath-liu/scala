package typeDemo

object Execrise {

  def main(args: Array[String]): Unit = {
    val stu1 = new Student("tom",20,0.1)
    val stu2 = new Student("john",20,0.1)
    val pair = new Pair(stu1,stu2)
    println(makePair(pair))

    val p1 = new Person("teacher",50)
    println(makeFriends(stu1,p1))
    val god = new God()
    findFriend(stu1::Nil,god=>stu2)//协变与逆变只适用于泛型类上，声明出这个类的父子关系伴随泛型而改变
  }

  def makePair(p:Pair[Person])={
    //(p.first,p.second)
  }

  def makeFriends(s:Student,f:Friend[Student])={
    f.beFriend(s)
  }

  def findFriend(list:List[Student],function1: Function1[Person,Student]): Unit ={

  }

}
