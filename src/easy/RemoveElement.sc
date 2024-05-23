object Solution {
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    val result = nums.filter(_ != `val`)
    for (i <- result.indices) {
      nums(i) = result(i)
    }
    result.length
  }
}


/*
Runtime
592
ms
Beats
83.22%
of users with Scala
Memory
59.06
MB
Beats
24.83%
of users with Scala
 */