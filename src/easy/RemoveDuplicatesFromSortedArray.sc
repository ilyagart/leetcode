def removeDuplicates(nums: Array[Int]): Int =
  nums.distinct.copyToArray(nums)

/*
Runtime
718
ms
Beats
36.36%
of users with Scala
Memory
61.16
MB
Beats
40.00%
of users with Scala
 */