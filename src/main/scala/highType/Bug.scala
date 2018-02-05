package highType

class Bug(var distance:Int = 0) {

  var direct = true
  //val distance = 0

  def move(length:Int): this.type ={
    if(direct)
      distance+=length
    else
      distance-=length
    this
  }

  def show:this.type = {
    println(distance)
    this
  }

  def turn:this.type = {
    if(direct)
      direct = true
    else
      direct = false
    this
  }

}
