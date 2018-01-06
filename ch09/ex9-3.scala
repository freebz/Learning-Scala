// 객체를 가지는 명령줄 애플리케이션

object Date {
  def main(args: Array[String]) {
    println(new java.util.Date)
  }
}



object Cat {
  def main(args: Array[String]) {
    for (arg <- args) {
      println( io.Source.fromFile(arg).mkString )
    }
  }
}
