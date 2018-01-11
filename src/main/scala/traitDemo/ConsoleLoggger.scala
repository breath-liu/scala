package traitDemo

trait ConsoleLoggger extends Logger with Serializable {//可以继承多个特质 特质可以有构造器，但是不能有参数

  def log(log: String): Unit = println(log)//带有实现方法的特质
}
