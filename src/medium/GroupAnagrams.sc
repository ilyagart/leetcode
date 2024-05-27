import scala.collection.immutable.ArraySeq
import scala.collection.mutable

def groupAnagrams(strs: Array[String]): List[List[String]] = {
  val map = mutable.HashMap[ArraySeq[Int], List[String]]()
  for (str <- strs) {
    val arr = Array.ofDim[Int](26)
    for c <- str do arr(c - 'a') += 1
    val key = ArraySeq.ofInt(arr)
    map.addOne(key -> (str :: map.getOrElse(key, List.empty[String])))
  }
  map.values.toList
}

groupAnagrams(Array("eat", "tea", "tan", "ate", "nat", "bat"))

/*
Runtime
756
ms
Beats
96.67%
of users with Scala
Memory
64.04
MB
Beats
59.17%
of users with Scala
 */