// 함수 리터럴

val doubler = (x: Int) => x * 2

val doubled = doubler(22)


val greeter = (name: String) => s"Hello, $name"

val hi = greeter("World")


def max(a: Int, b: Int) = if (a > b) a else b

val maximize: (Int, Int) => Int = max

val maximize = (a: Int, b: Int) => if (a > b) a else b

maximize(84, 96)


def logStart() = "=" * 50 + "\nStart NOW\n" + "=" * 50

val start = () => "=" * 50 + "\nStarting NOW\n" + "=" * 50

println( start() )


def safeStringOp(s: String, f: String => String) = {
  if (s != null) f(s) else s
}

safeStringOp(null, (s: String) => s.reverse)

safeStringOp("Ready", (s: String) => s.reverse)


safeStringOp(null, s => s.reverse)

safeStringOp("Ready", s => s.reverse)
