// 매치 표현식

val x = 10; val y = 20

val max = x > y match {
  case true => x
  case false => y
}


val status = 500

val message = status match {
  case 200 =>
    "ok"
  case 400 => {
    println("ERROR - we called the service incorrectly")
    "error"
  }
  case 500 => {
    println("ERROR - the service encountered an error")
    "error"
  }
}


val day = "MON"

val kind = day match {
  case "MON" | "TUE" | "WED" | "THU" | "FRI" =>
    "weekday"
  case "SAT" | "SUN" =>
    "weekend"
}


"match me" match { case "nope" => "sorry" }
