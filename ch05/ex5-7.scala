// 부분 함수

val statusHandler: Int => String = {
  case 200 => "Okay"
  case 400 => "Your Error"
  case 500 => "Our error"
}


statusHandler(200)

statusHandler(400)


statusHandler(401)
