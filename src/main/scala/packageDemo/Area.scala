
/**
  * Created by Administrator on 2018/1/8.
  */
package world{
  package object country{
    val defaultname = "default"
  }
  package country{
    class Area {
      defaultname
      private val city = new City("城市","aisa")//同包之内不需要导包，package只是逻辑上的的概念，不一定真实存在,但是为了方便查找文件scala不建议你这样做
    }
  }
}

package world{
  package univeres{

    import classDemo2.Time

    class Demo{
      val n = country.defaultname
      private val area = new country.Area//scala包名可以用相对路径
      import classDemo2.Stu//import 语句可以出现在代码的任何部分，而不仅仅是顶部 ，他的作用范围从当前位置一直到文件的末尾
      import classDemo2.{Stu=>student/*重命名*/,Time=>_/*隐藏成员，避免歧义*/}//
      Stu(1,"")
      new Time
    }
  }
}
