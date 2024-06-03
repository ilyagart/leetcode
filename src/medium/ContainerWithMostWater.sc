object Solution {
  def maxArea(height: Array[Int]): Int = {
    var left = 0
    var right = height.length - 1
    var maxArea = 0
    while (left != right) {
      val tmpArea = height(left).min(height(right)) * (right - left)
      maxArea = maxArea.max(tmpArea)
      if (height(left) < height(right))
        left += 1
      else
        right -= 1
    }
    maxArea
  }
}

Solution.maxArea(Array(1, 8, 6, 2, 5, 4, 8, 3, 7))
Solution.maxArea(Array(1, 2, 4, 3))

/*
Runtime
823ms
Beats85.93%of users with Scala
Memory
68.04MB
Beats39.26%of users with Scala
 */