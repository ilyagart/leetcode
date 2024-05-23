class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

def addTwoNumbers(l1: ListNode, l2: ListNode, carry: Int = 0): ListNode = (l1, l2) match {
  case (null, null) => if (carry > 0) new ListNode(carry, null) else null
  case (_, null) => addTwoNumbers(l1, new ListNode(0, null), carry)
  case (null, _) => addTwoNumbers(l2, new ListNode(0, null), carry)
  case (_, _) =>
    val sum: Int = l1.x + l2.x + carry
    new ListNode(sum % 10, addTwoNumbers(l1.next, l2.next, sum / 10))
}

/*
Runtime
703
ms
Beats
91.87%
of users with Scala
Memory
62.51
MB
Beats
17.70%
of users with Scala
 */