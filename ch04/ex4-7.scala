// 이름으로 매개변수를 지정하여 함수 호출하기

def greet(prefix: String, name: String) = s"$prefix $name"

val greeting1 = greet("Ms", "Brown")

val greeting2 = greet(name = "Brown", prefix = "Mr")
