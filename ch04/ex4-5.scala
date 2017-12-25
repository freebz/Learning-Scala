// 재귀 함수

def power(x: Int, n: Int): Long = {
  if (n >= 1) x * power(x, n-1)
  else 1
}

power(2, 8)

power(2, 1)

power(2, 0)


@annotation.tailrec
def power(x: Int, n: Int): Long = {
  if (n >= 1) x * power(x, n-1)
  else 1
}


@annotation.tailrec
def power(x: Int, n: Int): Long = {
  if (n < 1) 1
  else x * power(x, n-1)
}


@annotation.tailrec
def power(x: Int, n: Int, t: Int = 1): Int = {
  if (n < 1) t
  else power(x, n-1, x*t)
}

power(2,8)
