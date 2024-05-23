def canConstruct(ransomNote: String, magazine: String): Boolean =
  (ransomNote diff magazine).isEmpty


/*
Runtime
706
ms
Beats
58.46%
of users with Scala
Memory
57.00
MB
Beats
83.08%
of users with Scala
 */