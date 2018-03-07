package think

class DomainChecker(val data:String) {

  def isValid:Boolean={
    if(data.length>3)
      true
    else
      false
  }
}

object DomainChecker{

  implicit def StringToChecker(data:String)={
    new DomainChecker(data)
  }

}
