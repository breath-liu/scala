package implicitDemo

class Delimiter(val left:String,val right:String) extends Serializable {

  //implicit val imp = new Delimiter("<",">")//在类中定义隐式变量编译器是不识别的


}

object Delimiter{
  implicit val imp = new Delimiter("<",">")
}

