// 가독성 있는 함수 작성하기

/**
  * 선행 혹은 후행 공백 없이 입력 문자열을 반환함.
  * 입력 문자열이 널일 경우 null을 반환함.
  * 매개변수 s는 입력 문자열임.
  */
def safeTrim(s: String): String = {
  if (s == null) return null
  s.trim()
}
