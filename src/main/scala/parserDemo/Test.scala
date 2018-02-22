package parserDemo

import scala.util.parsing.combinator.RegexParsers

class Test extends RegexParsers {
  //op ::= "+" | "-" | "*"
  val number = "[0-9]+".r

  //def factor:Parser[Any] = number | "("+expr+")"
  //def expr:Parser[Any]

}




