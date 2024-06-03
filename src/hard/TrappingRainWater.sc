def trap(height: Array[Int]): Int = {
  var left = 0
  var right = height.length - 1
  var leftMax = height(0)
  var rightMax = height(height.length - 1)
  var water = 0
  while (left < right) {
    if (leftMax < rightMax) {
      water += leftMax - height(left)
      left += 1
      leftMax = leftMax.max(height(left))
    }
    else {
      water += rightMax - height(right)
      right -= 1
      rightMax = rightMax.max(height(right))
    }
  }
  water
}

trap(Array(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))

/*
Runtime
639ms
Beats97.46%of users with Scala
Memory
59.01MB
Beats86.44%of users with Scala
 */