def isMonotonic(nums: Array[Int]): Boolean = {
  var inc = true
  var dec = true

  for (i <- 1 until nums.length) {
    if (nums(i) < nums(i - 1)) {
      inc = false
    }
    if (nums(i) > nums(i - 1)) {
      dec = false
    }
  }

  inc || dec
}

/*
Runtime
967
ms
Beats
100.00%
of users with Scala
Memory
72.96
MB
Beats
100.00%
of users with Scala
 */