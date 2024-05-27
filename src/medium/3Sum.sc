def threeSum(nums: Array[Int]): List[List[Int]] = {
  val sorted = nums.sorted
  var result: List[List[Int]] = Nil

  for (i <- 0 until sorted.length - 2) {
    if (i == 0 || (i > 0 && sorted(i) != sorted(i - 1))) {
      var left = i + 1
      var right = sorted.length - 1
      val target = -sorted(i)

      while (left < right) {
        if (sorted(left) + sorted(right) == target) {
          result = List(sorted(i), sorted(left), sorted(right)) :: result

          while (left < right && sorted(left) == sorted(left + 1))
            left += 1
          while (left < right && sorted(right) == sorted(right - 1))
            right -= 1

          left += 1
          right -= 1
        } else if (sorted(left) + sorted(right) < target)
          left += 1
        else
          right -= 1
      }
    }
  }

  result
}

threeSum(Array(-1, 0, 1, 2, -1, -4))
threeSum(Array(0, 1, 1))
threeSum(Array(0, 0, 0))

/*
Runtime
925
ms
Beats
83.00%
of users with Scala
Memory
65.08
MB
Beats
84.00%
of users with Scala
 */