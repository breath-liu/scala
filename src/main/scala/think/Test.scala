package think

object Test {

  val domain = "www.baidu.com."

  def main(args: Array[String]): Unit = {
    getChoose match {
      case `checkLength` =>
        import DomainChecker._
        println(domain.isValid)
      case `checkName` =>
        import DomainNameChecker._
        println(domain.isValid)
    }
  }

  def validDomain(checker: (String)=>Boolean): Unit ={
    checker(domain)
  }

}


