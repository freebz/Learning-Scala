// 이름에 의한 호출 매개변수

def doubles(x: => Int) = {
  println("Now doubling " + x)
  x * 2
}

doubles(5)

def f(i: Int) = { println(s"Hello from f($i)"); i }

doubles( f(8) )
