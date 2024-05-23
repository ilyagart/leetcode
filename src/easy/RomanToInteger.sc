private val romans = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)

def romanToInt(s: String) = {
  s.map(romans).toList.reverse.reduce {
    case (cur, next) if next * 3 < cur =>
      cur - next
    case (cur, next) =>
      cur + next
  }
}

/*
Runtime
667
ms
Beats
75.51%
of users with Scala
Memory
58.63
MB
Beats
37.76%
of users with Scala
 */