package think

class DomainNameChecker(val data:String) {

  def isValid:Boolean={
    if(data.startsWith("b"))
      true
    else
      false
  }
}

object DomainNameChecker{

  implicit def StringToChecker(data:String)={
    new DomainNameChecker(data)
  }

}
