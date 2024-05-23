def findKthLargest(nums: Array[Int], k: Int): Int = {
  val heap = new scala.collection.mutable.PriorityQueue[Int]()(Ordering.Int.reverse)
  heap.addAll(nums.take(k))
  nums.slice(k, nums.length).foreach { n =>
    heap.addOne(n)
    heap.dequeue()
  }
  heap.head
}

/*
Runtime
1009
ms
Beats
58.06%
of users with Scala
Memory
71.25
MB
Beats
90.32%
of users with Scala
 */