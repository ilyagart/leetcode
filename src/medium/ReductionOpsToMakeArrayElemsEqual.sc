def reductionOperations(nums: Array[Int]): Int = {
  val view = nums.view.sorted
  view
    .zip(view.tail)
    .scanLeft(0) {
      case (num, (prev, curr)) if prev == curr => num
      case (num, _) => num + 1
    }
    .sum
}

/*
Runtime
1280
ms
Beats
100.00%
of users with Scala
Memory
69.62
MB
Beats
50.00%
of users with Scala
 */