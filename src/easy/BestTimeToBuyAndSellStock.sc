def maxProfit(prices: Array[Int]): Int = {
  prices.scanRight(0)(scala.math.max).zip(prices).map { case (a, b) => a - b }.max
}

/*
Runtime
1197
ms
Beats
11.56%
of users with Scala
Memory
74.28
MB
Beats
89.80%
of users with Scala
 */