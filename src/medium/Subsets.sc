def subsets(nums: Array[Int]): List[List[Int]] =
  nums.foldLeft(List(List[Int]()))((acc, i) => acc ::: acc.map(i :: _))

/*
Runtime
636
ms
Beats
39.19%
of users with Scala
Memory
59.14
MB
Beats
33.78%
of users with Scala
 */