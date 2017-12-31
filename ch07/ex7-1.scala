// 가변적인 컬렉션

val m = Map("AAPL" -> 597, "MSFT" -> 40)

val n = m - "AAPL" + ("GOOG" -> 521)

println(m)
