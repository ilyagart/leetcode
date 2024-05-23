def minSubArrayLen(target: Int, nums: Array[Int]): Int = {
  val length = nums.length
  var left = 0
  var right = 0
  var sum = 0
  var res = Int.MaxValue
  while (right < length) {
    sum += nums(right)
    right += 1
    while (sum >= target && left < right) {
      res = res.min(right - left)
      sum -= nums(left)
      left += 1
    }
  }
  if (res == Int.MaxValue)
    0
  else
    res
}

/*
Runtime
734
ms
Beats
94.29%
of users with Scala
Memory
70.69
MB
Beats
54.29%
of users with Scala
 */