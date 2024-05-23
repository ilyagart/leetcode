def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
  val merged = (nums1 ++ nums2).sorted
  val len = merged.length
  if (len % 2 != 0)
    merged(len / 2)
  else
    (merged(len / 2 - 1) + merged(len / 2)).toDouble / 2
}

/*
Runtime
802
ms
Beats
85.22%
of users with Scala
Memory
61.67
MB
Beats
53.91%
of users with Scala
 */