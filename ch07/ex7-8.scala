// 모나딕 컬렉션

// Option 컬렉션

var x: String = "Indeed"

var a = Option(x)

x = null

var b = Option(x)



println(s"a is defined? ${a.isDefined}")

println(s"b is defined? ${b.isDefined}")



def divide(amt: Double, divisor: Double): Option[Double] = {
  if (divisor == 0) None
  else Option(amt / divisor)
}

val legit = divide(5, 2)

val illegit = divide(3, 0)



val odds = List(1, 3, 5)

val firstOdd = odds.headOption

val evens = odds filter (_ % 2 == 0)

val firstEven = evens.headOption



val words = List("risible", "scavenger", "gist")

val uppercase = words find (w => w == w.toUpperCase)

val lowercase = words find (w => w == w.toLowerCase)



val filtered = lowercase filter (_ endsWith "ible") map (_.toUpperCase)

val exactSize = filtered filter (_.size > 15) map (_.size)
