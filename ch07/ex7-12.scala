// 비동기식으로 퓨처 처리하기

import concurrent.ExecutionContext.Implicits.global

import concurrent.Future

def nextFtr(i: Int = 0) = Future {
  def rand(x: Int) = util.Random.nextInt(x)

  Thread.sleep(rand(5000))
  if (rand(3) > 0) (i + 1) else throw new Exception
}



import concurrent.Future
def cityTemp(name: String): Double = {
  val url = "http://api.openweathermap.org/data/2.5/weather"
  val cityUrl = s"$url?&APPID=72bf27b20bf867de6236aca3a27e0d1&q=$name"
  val json = io.Source.fromURL(cityUrl).mkString.trim
  val pattern = """.*"temp":([\d.]+).*""".r
  val pattern(temp) = json
  temp.toDouble
}

val cityTemps = Future sequence Seq(
  Future(cityTemp("Fresno")), Future(cityTemp("Tempe"))
)

cityTemps onSuccess {
  case Seq(x,y) if x > y => println(s"Fresno is warmer: $x K")
  case Seq(x,y) if y > x => println(s"Tempe is warmer: $y K")
}
