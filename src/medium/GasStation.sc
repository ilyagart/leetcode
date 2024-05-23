def canCompleteCircuit(gas: Array[Int], cost: Array[Int]): Int = {
  val diffs = gas.zip(cost).map(_ - _)

  val start = diffs.indices.foldLeft((0, 0)) { case ((index, tank), i) =>
    if (tank + diffs(i) < 0) (i + 1, 0) else (index, tank + diffs(i))
  }._1

  if (diffs.sum < 0) -1 else start
}

/*
Runtime
1060
ms
Beats
33.33%
of users with Scala
Memory
74.41
MB
Beats
66.67%
of users with Scala
 */