def longestConsecutive(nums: Array[Int]): Int = {
  val sorted = nums.sorted
  var pointer = 0
  var tmpLen = 1
  var result = 0
  if (nums.length == 1)
    result = 1
  while (pointer < sorted.length - 1) {
    if (sorted(pointer) == sorted(pointer + 1))
      pointer += 1
    else if (sorted(pointer) == sorted(pointer + 1) - 1) {
      tmpLen += 1
      pointer += 1
    }
    else {
      tmpLen = 1
      pointer += 1
    }
    result = result.max(tmpLen)
  }
  result
}


longestConsecutive(Array(100, 4, 200, 1, 3, 2))
longestConsecutive(Array(0, 3, 7, 2, 5, 8, 4, 6, 0, 1))

/**
 * Runtime
 * 901
 * ms
 * Beats
 * 97.67%
 * of users with Scala
 * Memory
 * 80.44
 * MB
 * Beats
 * 62.79%
 * of users with Scala
 */