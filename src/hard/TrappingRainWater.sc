def trap(height: Array[Int]): Int =
  height.scanLeft(0)(_ max _).tail.zip(height.scanRight(0)(_ max _).init).map(_ min _).lazyZip(height).map(_ - _).sum

/*
Runtime
731
ms
Beats
30.91%
of users with Scala
Memory
61.28
MB
Beats
34.55%
of users with Scala
 */