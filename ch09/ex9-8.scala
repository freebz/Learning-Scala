// 인스턴스 구성원 임포트하기

case class Receipt(id: Int, amount: Double, who: String, title: String)

{
  val latteReceipt = Receipt(123, 4.12, "fred", "Medium Latte")
  import latteReceipt._
  println(s"Sold a $title for $amount to $who")
}



import util.Random._

val letters = alphanumeric.take(20).toList.mkString

val numbers = shuffle(1 to 20)
