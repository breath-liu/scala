package operatorDemo

import scala.language.dynamics

class DynamicClass extends Dynamic {

  var name = "john"
  var map = Map("john"->"wall")

  def applyDynamic(method:String)(args:String)={
    method match {
      case "getValueByName"=>map(args)
      case _=>None
    }
  }

  def selectDynamic(filed:String)={
    filed match {
      case "name"=>name
      case _=>None
    }
  }

  def updateDynamic(filed:String)(value:String): Unit ={
    filed match {
      case "name"=>this.name = value
      case _=>()
    }
  }

}
