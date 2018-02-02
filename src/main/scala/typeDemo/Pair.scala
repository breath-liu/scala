package typeDemo

//如果这里是用var并且没有访问修饰符来限制getter,setter方法的生成，会报错
//scala规定方法的参数是逆变的，返回值是协变的（重要），依据是里氏代换原则
class Pair[+T](private[this] var first:T,private[this] var second:T) {//协变，与类型T按照同样的方式进行形变，如果stu是person的子类型，那么Pair[stu]也是Pair[Person]的子类型


}
