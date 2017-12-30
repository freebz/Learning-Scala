// 리스트 축소하기

val validations = List(true, true, false, true, true, true)

val valid1 = !(validations contains false)

val valid2 = validations forall (_ == true)

val valid3 = validations.exists(_ == false) == false


def contains(x: Int, l: List[Int]): Boolean = {
  var a: Boolean = false
  for (i <- l) { if (!a) a = (i == x) }
  a
}

val included = contains(19, List(46, 19, 92))



def boolReduce(l: List[Int], start: Boolean)(f: (Boolean, Int) =>
  Boolean): Boolean = {

  var a = start
  for (i <- l) a = f(a, i)
  a
}

val included = boolReduce(List(46, 19, 92), false) { (a, i) =>
  if (a) a else (i == 19)
}



def reduceOp[A,B](l: List[A], start: B)(f: (B, A) => B): B = {
  var a = start
  for (i <- l) a = f(a, i)
  a
}

val included = reduceOp(List(46, 19, 92), false) { (a, i) =>
  if (a) a else (i == 19)
}

val answer = reduceOp(List(11.3, 23.5, 7.2), 0.0)(_ + _)



val included = List(46, 19, 92).foldLeft(false) { (a, i) =>
  if (a) a else (i == 19)
}

val answer = List(11.3, 23.5, 7.2).reduceLeft(_ + _)
