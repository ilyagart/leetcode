import scala.collection.mutable

def convert(s: String, numRows: Int): String = {
  val charMatrix = mutable.ArrayBuffer.fill(numRows)("")
  var row = 0
  var zigzagging = false
  if (numRows == 1)
    return s
  else {
    for (c <- s) {
      if (row == numRows - 1)
        zigzagging = true
      else if (zigzagging && row == 0)
        zigzagging = false
      if (row < numRows && !zigzagging) {
        charMatrix(row) += c
        row += 1
      }
      else if (zigzagging) {
        {
          charMatrix(row) += c
          row -= 1
        }
      }
    }
  }

  charMatrix.mkString
}

/*
Runtime
725
ms
Beats
85.29%
of users with Scala
Memory
61.04
MB
Beats
44.12%
of users with Scala
 */