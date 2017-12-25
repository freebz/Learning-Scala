// 부분 적용 함수와 커링

def factorOf(x: Int, y: Int) = y % x == 0


val f = factorOf _

val x = f(7, 20)


val multipleOf3 = factorOf(3, _: Int)

val y = multipleOf3(78)


def factorOf(x: Int)(y: Int) = y % x == 0

val isEven = factorOf(2) _

val z = isEven(32)
