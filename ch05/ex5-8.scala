// 함수 리터럴 블록으로 고차 함수 호출하기

def safeStringOp(s: String, f: String => String) = {
  if (s != null) f(s) else s
}

val uuid = java.util.UUID.randomUUID.toString

val timedUUID = safeStringOp(uuid, { s =>
  val now = System.currentTimeMillis
  val timed = s.take(24) + now
  timed.toUpperCase
})


def safeStringOp(s: String)(f: String => String) = {
  if (s != null) f(s) else s
}

val timedUUID = safeStringOp(uuid) { s =>
  val now = System.currentTimeMillis
  val timed = s.take(24) + now
  timed.toUpperCase
}


def timer[A](f: => A): A = {
  def now = System.currentTimeMillis
  var start = now; val a = f; val end = now
  println(s"Executed in ${end - start} ms")
  a
}

val veryRandomAmount = timer {
  util.Random.setSeed(System.currentTimeMillis)
  for (i <- 1 to 100000) util.Random.nextDouble
  util.Random.nextDouble
}
