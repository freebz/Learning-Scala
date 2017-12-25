// 기본값을 갖는 매개변수

def greet(prefix: String = "", name: String) = s"$prefix$name"

val greeting1 = greet(name = "Paul")


def greet(name: String, prefix: String = "") = s"$prefix$name"

val greeting2 = greet("Ola")
