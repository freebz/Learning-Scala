// 경계가 있는 타입

class BaseUser(val name: String)

class Admin(name: String, val level: String) extends BaseUser(name)

class Customer(name: String) extends BaseUser(name)

class PreferredCustomer(name: String) extends Customer(name)



def check[A <: BaseUser](u: A) { if (u.name.isEmpty) println("Fail!") }

check(new Customer("Fred"))

check(new Admin("", "strict"))



def recruit[A >: Customer](u: Customer): A = u match {
  case p: PreferredCustomer => new PreferredCustomer(u.name)
  case c: Customer => new Customer(u.name)
}

val customer = recruit(new Customer("Fred"))

val preferred = recruit(new PreferredCustomer("George"))



abstract class Card {
  type UserType <: BaseUser
  def verify(u: UserType): Boolean
}

class SecurityCard extends Card {
  type UserType = Admin
  def verify(u: Admin) = true
}

val v1 = new SecurityCard().verify(new Admin("George", "high"))

class GiftCard extends Card {
  type UserType = Customer
  def verify(u: Customer) = true
}

val v2 = new GiftCard().verify(new Customer("Fred"))
