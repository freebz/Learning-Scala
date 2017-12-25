// 함수

def hi = "hi"

hi


def hi: String = "hi"


def multiplier(x: Int, y: Int): Int = { x * y }

multiplier(6, 7)


def safeTrim(s: String): String = {
  if (s == null) return null
  s.trim()
}
