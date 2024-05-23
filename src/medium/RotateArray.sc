def rotate(nums: Array[Int], k: Int): Unit = {
  val len = nums.length
  val x = len - k % len
  val result = nums.slice(x, len) ++ nums.take(x)
  result.copyToArray(nums)
}

/*
Runtime
776
ms
Beats
62.16%
of users with Scala
Memory
69.96
MB
Beats
79.73%
of users with Scala
 */