// 프라이버시 제어

class User { protected val passwd = scala.util.Random.nextString(10) }

class ValidUser extends User { def isValid = ! passwd.isEmpty }

val isValid = new ValidUser().isValid

val passwd = new User().passwd



class User(private var password: String) {
  def update(p: String) {
    println("Modifying the password!")
    password = p
  }
  def validate(p: String) = p == password
}

val u = new User("1234")

val isValid = u.validate("4567")

u.update("4567")

val isValid = u.validate("4567")
