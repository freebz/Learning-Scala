// 고차 함수

def safeStringOp(s: String, f: String => String) = {
  if (s != null) f(s) else s
}

def reverser(s: String) = s.reverse

safeStringOp(null, reverser)

safeStringOp("Ready", reverser)
