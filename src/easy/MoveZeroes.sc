def moveZeroes(nums: Array[Int]): Unit = {
  val len = nums.length
  var zeroCount = 0
  for (i <- nums.indices)
    if (nums(i) == 0)
      zeroCount += 1
    else if (zeroCount > 0)
      nums(i - zeroCount) = nums(i)
  for (i <- len - zeroCount until len)
    nums(i) = 0
}

/*
Runtime
731
ms
Beats
68.29%
of users with Scala
Memory
58.20
MB
Beats
93.90%
of users with Scala
 */