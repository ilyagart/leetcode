def removeDuplicates(nums: Array[Int]): Int = {
  val x: Array[Int] = nums.groupBy(identity).values.flatMap(_.take(2)).toArray.sorted
  x.copyToArray(nums)
  x.length
}

/*
Runtime
716
ms
Beats
11.87%
of users with Scala
Memory
60.14
MB
Beats
5.09%
of users with Scala
 */