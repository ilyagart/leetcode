def canJump(nums: Array[Int]): Boolean = {
  val len = nums.length
  var lastJumpIndex = len - 1

  for (i <- len - 1 to 0 by -1) {
    if (i + nums(i) >= lastJumpIndex) {
      lastJumpIndex = i
    }
  }
  lastJumpIndex == 0
}

/*
Runtime
761
ms
Beats
87.72%
of users with Scala
Memory
58.74
MB
Beats
77.19%
of users with Scala
 */