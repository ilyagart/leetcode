class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}

def sumNumbers(root: TreeNode): Int = {

  def dfs(acc: Int, node: TreeNode): Int = {
    val newAcc = acc * 10 + node.value

    (node.left, node.right) match {
      case (null, null) => newAcc
      case (nodeLeft, null) => dfs(newAcc, nodeLeft)
      case (null, nodeRight) => dfs(newAcc, nodeRight)
      case (nodeLeft, nodeRight) => dfs(newAcc, nodeLeft) + dfs(newAcc, nodeRight)
    }
  }

  dfs(0, root)
}

/*
Runtime
589
ms
Beats
71.74%
of users with Scala
Memory
60.70
MB
Beats
8.70%
of users with Scala
 */