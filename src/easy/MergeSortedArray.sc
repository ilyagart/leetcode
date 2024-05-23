def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
  import scala.annotation.tailrec
  @tailrec
  def recMerge(ar1: Array[Int], ar2: Array[Int], res: Array[Int]): Array[Int] = {
    if (ar1.isEmpty)
      res ++ ar2
    else if (ar2.isEmpty)
      res ++ ar1
    else if (ar2.head <= ar1.head)
      recMerge(ar1, ar2.tail, res :+ ar2.head)
    else if (ar1.head <= ar2.head)
      recMerge(ar1.tail, ar2, res :+ ar1.head)
    else res
  }

  recMerge(nums1.dropRight(n), nums2, Array.empty[Int]).copyToArray(nums1)
}

/*
Runtime
615
ms
Beats
55.30%
of users with Scala
Memory
59.48
MB
Beats
6.06%
of users with Scala
 */