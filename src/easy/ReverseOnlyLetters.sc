def reverseOnlyLetters(s: String): String = {
  val reverseLetters = s.filter(_.isLetter).reverseIterator
  s.foldLeft("")((s, c) => if (c.isLetter) s :+ reverseLetters.next else s :+ c)
}

/*
Runtime
603
ms
Beats
50.00%
of users with Scala
Memory
56.52
MB
Beats
16.67%
of users with Scala
 */