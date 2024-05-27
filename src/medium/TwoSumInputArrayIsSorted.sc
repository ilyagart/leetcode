def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
  var left = 0
  var right = numbers.length - 1
  while (left < right) {
    if (numbers(left) < target - numbers(right))
      left += 1
    else if (numbers(left) > target - numbers(right))
      right -= 1
    else
      return Array(left + 1, right + 1)
  }
  Array()
}

twoSum(Array(2, 7, 11, 15), 9)
twoSum(Array(2, 3, 4), 6)
twoSum(Array(-1, 0), -1)
twoSum(Array(5, 25, 75), 100)

/*
Runtime
629
ms
Beats
98.18%
of users with Scala
Memory
61.79
MB
Beats
76.36%
of users with Scala
 */