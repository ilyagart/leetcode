def productExceptSelf(nums: Array[Int]): Array[Int] =
  nums.init.scanLeft(1)(_ * _).zip(nums.tail.scanRight(1)(_ * _)).map(_ * _)

/*
Runtime
997
ms
Beats
17.07%
of users with Scala
Memory
70.25
MB
Beats
46.34%
of users with Scala
 */