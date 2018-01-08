package packageDemo.test

/**
  * Created by Administrator on 2018/1/8.
  */
package world{
  package country{
    class Area {
      private val city = new City("城市","aisa")//同包之内不需要导包，package只是逻辑上的的概念，不一定真实存在,但是为了方便查找文件scala不建议你这样做
    }
  }
}
