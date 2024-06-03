def maxProfit(prices: Array[Int]): Int = {
  var buy = prices(0)
  var profit = 0
  for (price <- prices) {
    if (price < buy)
      buy = price
    else
      profit = profit.max(price - buy)
  }
  profit
}


maxProfit(Array(7, 1, 5, 3, 6, 4))
maxProfit(Array(7, 6, 4, 3, 1))

/*
949ms
Beats84.06%of users with Scala
Memory
77.11MB
Beats60.15%of users with Scala
 */