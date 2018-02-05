package typeDemo

//如果这里是用var并且没有访问修饰符来限制getter,setter方法的生成，会报错
//scala规定泛型（强调！！！）方法的参数是逆变的，返回值是协变的（重要），依据是里氏代换原则(理解有点错误)
//其实如果参数是一个普通类的的话，与java的方法调用并无差别，区别在于如果方法接受一个函数参数的话，被转换成了Function1~22的类型,而Function类是个泛型类，他规定了参数数是逆变的，返回值是协变的
class Pair[+T](val first:T,val second:T) {//协变，与类型T按照同样的方式进行形变，如果stu是person的子类型，那么Pair[stu]也是Pair[Person]的子类型

 /* def replaceFirst[R>:T](newFirst:R): Unit ={
    //this.first = newFirst
  }*/

  def getPair[A](init:A)(f:Function1[T,A]) ={

  }
}
