package classDemo2

/**
  * Created by Administrator on 2018/1/8.
  */
class Time(val hour:Int=0,val minutes:Int=0) {
  if(hour<0||hour>23)
    throw new IllegalArgumentException("hour must between 0 and 23")
  def before(other:Time)={
    if(hour==other.hour)
      minutes<other.minutes
    else
      hour<other.hour
  }
}
