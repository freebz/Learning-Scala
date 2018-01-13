// 추상 타입

class User(val name: String)

trait Factory { type A; def create: A }

trait UserFactory extends Factory {
  type A = User
  def create = new User("")
}



trait Factory[A] { def create: A }

trait UserFactory extends Factory[User] { def create = new User("") }
