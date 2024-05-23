def pivotIndex(nums: Array[Int]): Int =
  nums.indices.find(i => nums.sum - nums(i) == nums.take(i).sum * 2).getOrElse(-1)

/*
Runtime
5214
ms
Beats
6.25%
of users with Scala
Memory
61.14
MB
Beats
53.13%
of users with Scala
 */