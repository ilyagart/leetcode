def majorityElement(nums: Array[Int]): Int = {
  nums.sorted.apply(nums.length / 2)
}

/*
Runtime
748
ms
Beats
62.79%
of users with Scala
Memory
66.28
MB
Beats
32.56%
of users with Scala
 */