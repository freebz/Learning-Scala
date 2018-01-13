// 튜플과 함수값 클래스

val x: (Int, Int) = Tuple2(10, 20)

println("Does the arity = 2? " + (x.productArity == 2))



val hello1 = (n: String) => s"Hello, $n"

val h1 = hello1("Function Literals")

val hello2 = new Function1[String,String] {
  def apply(n: String) = s"Hello, $n"
}

val h2 = hello2("Function Instances")

println(s"hello1 = $hello1, hello2 = $hello2")



val doubler = (i: Int) => i*2

val plus3 = (i: Int) => i+3

val prepend = (doubler compose plus3)(1)

val append = (doubler andThen plus3)(1)
