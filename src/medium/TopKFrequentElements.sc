object Solution {
  def topKFrequent(nums: Array[Int], k: Int): Array[Int] =
    nums.groupMapReduce(identity)(_ => 1)(_ + _).toArray.sortBy(_._2).map(_._1).takeRight(k)
}

Solution.topKFrequent(Array(1, 1, 1, 2, 2, 3), 2)
Solution.topKFrequent(Array(4, 1, -1, 2, -1, 2, 3), 2)

/*
Runtime
815
ms
Beats
66.67%
of users with Scala
Memory
61.71
MB
Beats
94.74%
of users with Scala
 */