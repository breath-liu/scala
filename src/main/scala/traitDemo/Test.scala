package traitDemo

import java.awt.geom.Ellipse2D

object Test {

  def main(args: Array[String]): Unit = {
    val acc = new SavingAccount with ConsoleLoggger
    //acc.count()

    val account = new SavingAccount with TimeStampLogger with ClassnameLogger//具体实现取决于继承的顺序
    account.count()
    val account2 = new SavingAccount with ClassnameLogger with TimeStampLogger
    account2.count()

    val account4 = new Account
    println(account4.asInstanceOf[ClassnameLogger].classname)

    val exception = new UnhappyException

    val egg = new Ellipse2D.Double(5,10,20,30) with RectlangeLike//变量名不能以数字开头，用特质扩展类
    egg.getX
    egg.grow(1,2)
    egg.translate(2,3)

    val o1 = new OrderPoint(1,2)
    val o2 = new OrderPoint(3,4)
    o1.getX
    println(o2<o1)
  }
}
