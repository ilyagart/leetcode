def maxSubArray(nums: Array[Int]) = {
  var tempMax = 0
  var max = Int.MinValue
  for (i <- nums.indices) {
    tempMax = tempMax + nums(i)
    if (max < tempMax) {
      max = tempMax
    }
    if (tempMax < 0) {
      tempMax = 0
    }
  }
  max
}

/*
Runtime
921
ms
Beats
48.19%
of users with Scala
Memory
75.65
MB
Beats
91.57%
of users with Scala
 */