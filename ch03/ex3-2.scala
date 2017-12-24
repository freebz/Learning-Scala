// 표현식 블록

val x = 5 * 20; val amount = x + 10


val amount = { val x = 5 * 20; x + 10 }


val amount = {
  val x = 5 * 20
  x + 10
}


{ val a = 1; { val b = a * 2; { val c = b + 4; c } } }
