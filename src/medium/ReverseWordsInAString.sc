def reverseWords(s: String): String = {
  s.split(" ").map(_.trim).reverse.filter(_.nonEmpty).mkString(" ")
}

/*
Runtime
664
ms
Beats
30.55%
of users with Scala
Memory
56.58
MB
Beats
88.89%
of users with Scala
 */