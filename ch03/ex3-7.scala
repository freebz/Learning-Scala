// 패턴 변수를 이용한 타입 매칭

val x: Int = 12180

val y: Any = x

y match {
  case x: String => s"'x'"
  case x: Double => f"$x%.2f"
  case x: Float => f"$x%.2f"
  case x: Long => s"${x}l"
  case x: Int => s"${x}i"
}
