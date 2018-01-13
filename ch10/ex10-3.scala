// 묵시적 클래스

object IntUtils {
  implicit class Fishies(val x: Int) {
    def fishes = "Fish" * x
  }
}

import IntUtils._

println(3.fishes)



implicit class ArrowAssoc[A](x: A) {
  def ->[B](y: B) = Tuple2(x, y)
}
