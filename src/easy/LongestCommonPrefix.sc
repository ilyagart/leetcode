import scala.annotation.tailrec

@tailrec
def longestCommonPrefix(strings: Array[String], prefix: String = ""): String = {
  if (strings.isEmpty || strings.exists(_.isEmpty))
    prefix
  else if (strings.forall(_.head == strings.head.head))
    longestCommonPrefix(strings.map(_.tail), prefix :+ strings.head.head)
  else prefix
}

/*
Runtime
599
ms
Beats
74.64%
of users with Scala
Memory
58.73
MB
Beats
44.20%
of users with Scala
 */