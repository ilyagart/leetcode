import scala.annotation.tailrec

object Solution {
  def intToRoman(num: Int): String = {
    @tailrec
    def loop(x: Int, str: String): String = {
      if (x == 0) str
      else {
        x match {
          case x if x >= 1000 => loop(x - 1000, str + "M")
          case x if x >= 900 => loop(x - 900, str + "CM")
          case x if x >= 500 => loop(x - 500, str + "D")
          case x if x >= 400 => loop(x - 400, str + "CD")
          case x if x >= 100 => loop(x - 100, str + "C")
          case x if x >= 90 => loop(x - 90, str + "XC")
          case x if x >= 50 => loop(x - 50, str + "L")
          case x if x >= 40 => loop(x - 40, str + "XL")
          case x if x >= 10 => loop(x - 10, str + "X")
          case x if x >= 9 => loop(x - 9, str + "IX")
          case x if x >= 5 => loop(x - 5, str + "V")
          case x if x >= 4 => loop(x - 4, str + "IV")
          case x if x >= 1 => loop(x - 1, str + "I")
          case _ => loop(0, str)
        }
      }
    }

    loop(num, "")
  }
}

/*
Runtime
550
ms
Beats
91.53%
of users with Scala
Memory
54.33
MB
Beats
98.31%
of users with Scala
 */