// 클래스 정의하기

class Car(val make: String, var reserved: Boolean) {
  def reserve(r: Boolean): Unit = { reserved = r}
}

val t = new Car("Toyota", false)

t.reserve(true)

println(s"My ${t.make} is now reserved? ${t.reserved}")



val t2 = new Car(reserved = false, make = "Tesla")

println(t2.make)



class Car(val make: String, var reserved: Boolean) {
  def reserve(r: Boolean): Unit = { reserved = r }
}

class Lotus(val color: String, reserved: Boolean) extends
    Car("Lotus", reserved)

val l = new Lotus("Silver", false)

println(s"Requested a ${l.color} ${l.make}")



class Car(val make: String, var reserved: Boolean = true,
          val year: Int = 2015) {
  override def toString = s"$year $make, reserved = $reserved"
}

val a = new Car("Acura")

val l = new Car("Lexus", year = 2010)

val p = new Car(reserved = false, make = "Porsche")



class Singular[A](element: A) extends Traversable[A] {
  def foreach[B](f: A => B) = f(element)
}

val p = new Singular("Planes")

p foreach println

val name: String = p.head
