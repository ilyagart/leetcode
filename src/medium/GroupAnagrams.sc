import scala.collection.mutable

def groupAnagrams(strs: Array[String]): List[List[String]] = {
  val map = mutable.HashMap[String, List[String]]()
  for (str <- strs) {
    val sorted = str.sorted
    map.addOne(sorted -> (str :: map.getOrElse(sorted, List.empty[String])))
  }
  map.values.toList
}

groupAnagrams(Array("eat", "tea", "tan", "ate", "nat", "bat"))

/*
Runtime
815
ms
Beats
66.67%
of users with Scala
Memory
61.71
MB
Beats
94.74%
of users with Scala
 */