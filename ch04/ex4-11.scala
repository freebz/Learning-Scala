// 타입 매개변수

def identity(s: String): String = s

def identity(i: Int): Int = i


def identity(a: Any) Any = a

val s: String = identity("Hello")


def identity[A](a: A): A = a

val s: String = identity[String]("Hello")

val d: Double = identity[Double](2.717)


val s: String = identity("Hello")

val d: Double = identity(2.717)


val s = identity("Hello")
val d = identity(2.717)
