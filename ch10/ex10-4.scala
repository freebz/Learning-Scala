// 타입

// 타입 별칭

object TypeFun {
  type Whole = Int
  val x: Whole = 5

  type UserInfo = Tuple2[Int,String]
  val u: UserInfo = new UserInfo(123, "George")

  type T3[A,B,C] = Tuple3[A,B,C]
  val things = new T3(1, 'a', true)
}

val x = TypeFun.x

val u = TypeFun.u

val things = TypeFun.things
