// 생성 연산자

val numbers = 1 :: 2 :: 3 :: Nil


val first = Nil.::(1)

first.tail == Nil


val second = 2 :: first

second.tail == first
