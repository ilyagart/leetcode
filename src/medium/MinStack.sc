import scala.collection.mutable

class MinStack {
  val stack = mutable.Stack.empty[(Int, Int)]

  def push(elem: Int) = {
    val minElement = if (stack.nonEmpty && stack.top._2 < elem) stack.top._2 else elem
    val newElement = (elem, minElement)

    stack.push(newElement)
  }

  def pop() = stack.pop

  def top(): Int =
    stack.top._1

  def getMin: Int =
    stack.top._2
}

/*
Runtime
739
ms
Beats
63.64%
of users with Scala
Memory
67.30
MB
Beats
6.82%
of users with Scala
 */