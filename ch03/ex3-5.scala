// 와일드카드로 매칭하기

val message = "OK"

val status = message match {
  case "OK" => 200
  case other => {
    println(s"Couldn't parse $other")
    -1
  }
}


val message = "Unauthorized"

val status = message match {
  case "Ok" => 200
  case _ => {
    println(s"Couldn't parse $message")
    -1
  }
}
