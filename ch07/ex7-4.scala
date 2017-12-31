// 컬렉션 빌더 사용하기

val b = Set.newBuilder[Char]

b += 'h'

b ++= List('e', 'l', 'l', 'o')

val helloSet = b.result
