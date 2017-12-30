// 리스트에는 무엇이 있는가?

val colors = List("red", "green", "blue")


val oddsAndEvents = List(List(1, 3, 5), List(2, 4, 6))


val keyValues = List(('A', 65), ('B', 66), ('C', 67))


val primes = List(2, 3, 5, 7, 11, 13)

val first = primes(0)

val fourth = primes(3)


val first = primes.head

val remaining = primes.tail


val primes = List(2, 3, 5, 7, 11, 13)

var i = primes

while(! i.isEmpty) { print(i.head + ", "); i = i.tail }


val primes = List(2, 3, 5, 7, 11, 13)

def visit(i: List[Int]) { if (i.size > 0) { print(i.head + ", ");
  visit(i.tail) } }

visit(primes)


val primes = List(2, 3, 5, 7, 11, 13)

var i = primes

while(i != Nil) { print(i.head + ", "); i = i.tail }


val l: List[Int] = List()

l == Nil

val m: List[String] = List("a")

m.head

m.tail == Nil
