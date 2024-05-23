def permute(nums: Array[Int]): List[List[Int]] = {
  nums.permutations.map(_.toList).toList
}

/*
Runtime
711
ms
Beats
13.43%
of users with Scala
Memory
60.86
MB
Beats
26.87%
of users with Scala
 */