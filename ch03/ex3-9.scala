// 반복자 가드

val threes = for (i <- 1 to 20 if i % 3 == 0) yield i


val quote = "Faith,Hope,,Charity"

for {
  t <- quote.split(",")
  if t != null
  if t.size > 0
}
{ println(t) }
