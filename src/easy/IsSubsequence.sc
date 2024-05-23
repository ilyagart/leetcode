import scala.annotation.tailrec

@tailrec
def isSubsequence(s: String, t: String): Boolean = {
  if (s.isEmpty)
    true
  else if (t.isEmpty)
    false
  else if (t.head == s.head)
    isSubsequence(s.tail, t.tail)
  else isSubsequence(s, t.tail)
}

/*
Runtime
561
ms
Beats
60.00%
of users with Scala
Memory
56.73
MB
Beats
30.00%
of users with Scala
 */