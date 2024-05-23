def containsDuplicate(nums: Array[Int]): Boolean = {
  val set = new scala.collection.mutable.HashSet[Int]
  var seen = false
  val iterator = nums.iterator
  while (!seen && iterator.hasNext)
    seen = !set.add(iterator.next())
  seen
}

/*
Runtime
929
ms
Beats
97.95%
of users with Scala
Memory
75.06
MB
Beats
41.10%
of users with Scala
 */