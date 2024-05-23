def isAnagram(s: String, t: String): Boolean = {
  val counts = new Array[Int](26)
  s.foreach(c => counts(c - 'a') += 1)
  t.foreach(c => counts(c - 'a') -= 1)
  counts.forall(_ == 0)
}

/*
Runtime
694
ms
Beats
41.38%
of users with Scala
Memory
57.02
MB
Beats
81.03%
of users with Scala
 */