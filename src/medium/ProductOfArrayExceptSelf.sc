def productExceptSelf(nums: Array[Int]): Array[Int] = {
  val len = nums.length
  val prefix = new Array[Int](len)
  var suffix = 1
  prefix(0) = 1
  for (i <- 1 until len)
    prefix(i) = prefix(i - 1) * nums(i - 1)
  for (i <- len - 2 to 0 by -1) {
    suffix *= nums(i + 1)
    prefix(i) *= suffix
  }
  prefix
}

/*
Runtime
799
ms
Beats
97.56%
of users with Scala
Memory
67.12
MB
Beats
83.74%
of users with Scala
 */