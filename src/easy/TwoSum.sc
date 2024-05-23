import scala.collection.mutable

def twoSum(nums: Array[Int], target: Int): Array[Int] = {
  val numMap = new mutable.HashMap[Int, Int]()
  val n = nums.length
  (0 until n).map {
    i =>
      val num = target - nums(i)
      if (numMap.contains(num))
        return Array(numMap(num), i)
      numMap.put(nums(i), i)
  }
  Array()
}

twoSum(Array(2, 7, 11, 15), 9)
twoSum(Array(3, 2, 4), 6)
twoSum(Array(3, 3), 6)


/*
Runtime
564
ms
Beats
100.00%
of users with Scala
Memory
55.98
MB
Beats
100.00%
of users with Scala
 */