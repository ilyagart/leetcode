import scala.collection.mutable

object Solution {
  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    val set = mutable.HashSet.empty[Char]
    var valid = true
    var result = true
    for (row <- board) {
      valid = row.filter(_ != '.').forall(set.add)
      if (!valid)
        result = false
      set.clear()
    }

    for (column <- board.transpose) {
      valid = column.filter(_ != '.').forall(set.add)
      if (!valid)
        result = false
      set.clear()
    }

    (for {
      x <- 0 until 9 by 3
      y <- 0 until 9 by 3
    } yield (x, y)).foreach { (x, y) =>
      valid = (for {
        y <- y until y + 3
        slice <- board(y).slice(x, x + 3)
      } yield slice).filter(_ != '.').forall(set.add)
      if (!valid)
        result = false

      set.clear()
    }

    result
  }
}


val arr = Array(
  Array('5', '3', '.', '.', '7', '.', '.', '.', '.'),
  Array('6', '.', '.', '1', '9', '5', '.', '.', '.'),
  Array('.', '9', '8', '.', '.', '.', '.', '6', '.'),
  Array('8', '.', '.', '.', '6', '.', '.', '.', '3'),
  Array('4', '.', '.', '8', '.', '3', '.', '.', '1'),
  Array('7', '.', '.', '.', '2', '.', '.', '.', '6'),
  Array('.', '6', '.', '.', '.', '.', '2', '8', '.'),
  Array('.', '.', '.', '4', '1', '9', '.', '.', '5'),
  Array('.', '.', '.', '.', '8', '.', '.', '7', '9'))
val arr2 = Array(
  Array('.', '.', '4', '.', '.', '.', '6', '3', '.'),
  Array('.', '.', '.', '.', '.', '.', '.', '.', '.'),
  Array('5', '.', '.', '.', '.', '.', '.', '9', '.'),
  Array('.', '.', '.', '5', '6', '.', '.', '.', '.'),
  Array('4', '.', '3', '.', '.', '.', '.', '.', '1'),
  Array('.', '.', '.', '7', '.', '.', '.', '.', '.'),
  Array('.', '.', '.', '5', '.', '.', '.', '.', '.'),
  Array('.', '.', '.', '.', '.', '.', '.', '.', '.'),
  Array('.', '.', '.', '.', '.', '.', '.', '.', '.')
)
val arr3 = Array(
  Array('.', '.', '.', '.', '5', '.', '.', '1', '.'),
  Array('.', '4', '.', '3', '.', '.', '.', '.', '.'),
  Array('.', '.', '.', '.', '.', '3', '.', '.', '1'),
  Array('8', '.', '.', '.', '.', '.', '.', '2', '.'),
  Array('.', '.', '2', '.', '7', '.', '.', '.', '.'),
  Array('.', '1', '5', '.', '.', '.', '.', '.', '.'),
  Array('.', '.', '.', '.', '.', '2', '.', '.', '.'),
  Array('.', '2', '.', '9', '.', '.', '.', '.', '.'),
  Array('.', '.', '4', '.', '.', '.', '.', '.', '.')
)
//Solution.isValidSudoku(arr)
//Solution.isValidSudoku(arr2)
//Solution.isValidSudoku(arr3)

//arr3.grouped(3).flatMap(_.transpose.grouped(3)).map(_.flatten).toList
var x = 0
/*
Array(
Array(0, 0, 0, 0, 0, 0, 0, 0, 0),
Array(1, 1, 1, 1, 1, 1, 1, 1, 1),
Array(2, 2, 2, 2, 2, 2, 2, 2, 2),
Array(3, 3, 3, 3, 3, 3, 3, 3, 3),
Array(4, 4, 4, 4, 4, 4, 4, 4, 4),
Array(5, 5, 5, 5, 5, 5, 5, 5, 5),
Array(6, 6, 6, 6, 6, 6, 6, 6, 6),
Array(7, 7, 7, 7, 7, 7, 7, 7, 7),
Array(8, 8, 8, 8, 8, 8, 8, 8, 8)
)
 */
val array = Array.tabulate(9, 9)((a, b) => a)
val firstSquare = (0 until 3).map(x =>
  (0 until 3).map(y =>
    array(x)(y)
  )
)