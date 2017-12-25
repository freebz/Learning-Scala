// 자리표시자 구문

val doubler: Int => Int = _ * 2


def safeStringOp(s: String, f: String => String) = {
  if (s != null) f(s) else s
}

safeStringOp(null, _.reverse)

safeStringOp("Ready", _.reverse)


def combination(x: Int, y: Int, f: (Int,Int) => Int) = f(x,y)

combination(23, 12, _ * _)


def tripleOp(a: Int, b: Int, c: Int, f: (Int, Int, Int) => Int) = f(a,b,c)

tripleOp(23, 92, 14, _ * _ + _)


def tripleOp[A,B](a: A, b: A, c: A, f: (A, A, A) => B) = f(a,b,c)

tripleOp[Int,Int](23, 92, 14, _ * _ + _)

tripleOp[Int,Double](23, 92, 14, 1.0 * _ / _ / _)

tripleOp[Int,Boolean](93, 92, 14, _ > _ + _)
