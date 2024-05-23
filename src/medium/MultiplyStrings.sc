def multiply(num1: String, num2: String): String = {
  (for {
    l <- digits(num1)
    r <- digits(num2)
  } yield {
    l * r
  }).sum.toString
}

def digits(s: String): List[BigInt] = {
  digits(s, BigInt(10).pow(s.length - 1))
}

def digits(s: String, place: BigInt): List[BigInt] = {
  if (s.isEmpty)
    Nil
  else
    parseChar(s.head) * place :: digits(s.tail, place / 10)
}

def parseChar(c: Char): BigInt = c - '0'


/*
Runtime
632
ms
Beats
77.78%
of users with Scala
Memory
56.12
MB
Beats
92.59%
of users with Scala
 */