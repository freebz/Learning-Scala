// 익명 클래스

abstract class Listener { def trigger }

val myListener = new Listener {
  def trigger { println(s"Trigger at ${new java.util.Date}") }
}

myListener.trigger



abstract class Listener { def trigger }

class Listening {
  var listener : Listener = null
  def register(l: Listener) { listener = l }
  def sendNotification() { listener.trigger }
}

val notification = new Listening()

notification.register(new Listener {
  def trigger { println(s"Trigger at ${new java.util.Date}") }
})

notification.sendNotification
