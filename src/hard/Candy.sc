def candy(ratings: Array[Int]): Int = {
  val tmpCandy = Array.tabulate(ratings.length)(_ => 1)
  for (i <- ratings.indices.tail) {
    if (ratings(i) > ratings(i - 1))
      tmpCandy(i) = tmpCandy(i - 1) + 1
  }
  for (i <- ratings.indices.reverse.tail) {
    if (ratings(i) > ratings(i + 1))
      tmpCandy(i) = math.max(tmpCandy(i), tmpCandy(i + 1) + 1)
  }

  tmpCandy.sum
}

/*
Runtime
740
ms
Beats
64.00%
of users with Scala
Memory
59.65
MB
Beats
92.00%
of users with Scala
 */