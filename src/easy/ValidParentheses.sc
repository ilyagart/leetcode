import scala.collection.mutable

def isValid(s: String): Boolean = {
  val stack = mutable.Stack.empty[Char]
  val charMap = Map(')' -> '(', '}' -> '{', ']' -> '[')
  for (c <- s) {
    if (stack.nonEmpty && charMap.contains(c) && stack.head == charMap(c))
      stack.pop()
    else
      stack.push(c)
  }
  stack.isEmpty
}

/*
Runtime
586
ms
Beats
65.63%
of users with Scala
Memory
58.42
MB
Beats
49.22%
of users with Scala
 */