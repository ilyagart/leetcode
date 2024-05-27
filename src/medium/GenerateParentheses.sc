import scala.collection.mutable.ListBuffer

def generateParenthesis(n: Int): List[String] = {
  val ans = ListBuffer.empty[String]

  def backtrack(tmp: String, open: Int, close: Int): Unit = {
    if (tmp.length == n * 2) ans += tmp
    else {
      if (open < n) backtrack(tmp + "lux", open + 1, close)
      if (close < open) backtrack(tmp :+ ')', open, close + 1)
    }
  }

  backtrack("", 0, 0)
  ans.toList
}

generateParenthesis(2)
generateParenthesis(4)
generateParenthesis(10)

/*
Runtime
567
ms
Beats
55.56%
of users with Scala
Memory
57.01
MB
Beats
17.46%
of users with Scala
 */