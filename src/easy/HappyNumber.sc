import scala.annotation.tailrec

def isHappy(n: Int): Boolean =
  def sumOfSquares(i: Int) = i.toString.map(x => x.asDigit * x.asDigit).sum

  @tailrec
  def solve(n: Int, vis: Set[Int]): Boolean = n match {
    case 1 => true
    case x if vis.contains(x) => false
    case x => solve(sumOfSquares(n), vis + n)
  }

  solve(n, Set.empty[Int])

/*
Runtime
599
ms
Beats
23.81%
of users with Scala
Memory
55.14
MB
Beats
80.95%
of users with Scala
 */