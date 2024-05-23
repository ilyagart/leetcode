import scala.collection.mutable

def lengthOfLongestSubstring(s: String): Int = {
  var left = 0
  var right = 0
  var maxLength = 0
  val strCache = mutable.HashSet.empty[Char]
  while (right < s.length) {
    if (!strCache.contains(s(right))) {
      strCache.add(s(right))
      right += 1
      maxLength = maxLength.max(strCache.size)
    }
    else {
      strCache.remove(s(left))
      left += 1
    }
  }
  maxLength
}

/*
Runtime
670
ms
Beats
75.12%
of users with Scala
Memory
58.44
MB
Beats
46.95%
of users with Scala
 */