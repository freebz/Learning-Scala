// 불변의 컬렉션으로부터 가변적인 컬렉션 만들기

val m = Map("AAPL" -> 597, "MSFT" -> 40)

val b = m.toBuffer

b trimStart 1

b += ("GOOG" -> 521)

val n = b.toMap



b += ("GOOG" -> 521)

val l = b.toList

val s = b.toSet
