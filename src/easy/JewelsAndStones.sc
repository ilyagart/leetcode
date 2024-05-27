import scala.collection.immutable.HashSet

def numJewelsInStones(jewels: String, stones: String): Int = {
  var count = 0
  val set = HashSet.from(jewels)
  for (c <- stones)
    if (set.contains(c))
      count += 1

  count
}

numJewelsInStones("aA", "aAAbbbb")
numJewelsInStones("z", "ZZ")

/*
Runtime
560
ms
Beats
80.95%
of users with Scala
Memory
56.27
MB
Beats
71.43%
of users with Scala
 */