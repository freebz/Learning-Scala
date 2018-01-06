// 셀프 타입

class A { def hi = "hi" }

trait B { self: A =>
  override def toString = "B: " + hi
}

class C extends B

class C extends A with B

new C()



class TestSuite(suiteName: String) { def start() {} }

trait RandomSeeded { self: TestSuite =>
  def randomStart() {
    util.Random.setSeed(System.currentTimeMillis)
    self.start()
  }
}

class IdSpec extends TestSuite("ID Tests") with RandomSeeded {
  def testId() { println(util.Random.nextInt != 1) }
  override def start() { testId() }

  println("Starting...")
  randomStart()
}
