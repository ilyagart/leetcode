import scala.collection.mutable
import scala.util.Random

class RandomizedSet(map: mutable.HashMap[Int, Int] = mutable.HashMap.empty,
                    array: mutable.ArrayBuffer[Int] = mutable.ArrayBuffer.empty,
                    random: Random = new Random()) {

  def insert(elem: Int): Boolean =
    if (map.contains(elem))
      false
    else {
      array += elem
      map.put(elem, array.length - 1)
      true
    }

  def remove(elem: Int): Boolean =
    if (!map.contains(elem))
      false
    else {
      val lastElement = array.last
      val indexToRemove = map(elem)

      array(indexToRemove) = lastElement
      map(lastElement) = indexToRemove
      map.remove(elem)
      array.remove(array.length - 1)
      true
    }

  def getRandom: Int =
    array(random.nextInt(array.length))
}

/*
Runtime
1022
ms
Beats
93.75%
of users with Scala
Memory
98.13
MB
Beats
87.50%
of users with Scala
 */