// 컬렉션으로 패턴 매칭하기

val statuses = List(500, 404)

val msg = statuses.head match {
  case x if x < 500 => "okay"
  case _ => "whoah, an error"
}


val msg = statuses match {
  case x if x contains(500) => "has error"
  case _ => "okay"
}


val msg = statuses match {
  case List(500, x) => s"Error followed by $x"
  case List(e, x) => s"$e was followed by $x"
}


val head = List('r', 'g', 'b') match {
  case x :: xs => x
  case Nil => ' '
}


val code = ('h', 204, true) match {
  case (_, _, false) => 501
  case ('c', _, true) => 302
  case ('h', x, true) => x
  case (c, x, true) => {
    println(s"Did not expect code $c")
    x
  }
}
