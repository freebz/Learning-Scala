// 리스트 산술 연산자

val f = List(23, 8, 14, 21) filter (_ > 18)

val p = List(1, 2, 3, 4, 5) partition (_ < 3)

val s = List("apple", "to") sortBy (_.size)


val appended = List(1, 2, 3, 4) :+ 5

val suffix = appended takeRight 3

val middle = suffix dropRight 2
