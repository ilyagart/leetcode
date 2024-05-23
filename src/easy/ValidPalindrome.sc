def isPalindrome(s: String): Boolean = {
  val cleanS = s.replaceAll("[^A-Za-z0-9]", "").map(_.toLower)
  cleanS == cleanS.reverse
}

/*
Runtime
688
ms
Beats
19.84%
of users with Scala
Memory
56.21
MB
Beats
92.06%
of users with Scala
 */