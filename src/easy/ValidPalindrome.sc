def isPalindrome(s: String): Boolean = {
  var left = 0
  var right = s.length - 1
  while (left <= right) {
    if (!Character.isLetterOrDigit(s(left)))
      left += 1
    else if (!Character.isLetterOrDigit(s(right)))
      right -= 1
    else if (s(left).toLower != s(right).toLower)
      return false
    else {
      left += 1
      right -= 1
    }
  }
  true
}

isPalindrome("A man, a plan, a canal: Panama")
isPalindrome("raceacar")
isPalindrome("0P")
isPalindrome(" ")


/*
Runtime
621
ms
Beats
65.08%
of users with Scala
Memory
56.88
MB
Beats
69.84%
of users with Scala
 */