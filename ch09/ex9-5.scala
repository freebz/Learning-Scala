// 트레이트

trait HtmlUtils {
  def removeMarkup(input: String) = {
    input
      .replaceAll("""</?\w[^>]*>""","")
      .replaceAll("<.*>","")
  }
}

class Page(val s: String) extends HtmlUtils {
  def asPlainText = removeMarkup(s)
}

new Page("<html><body><h1>Introduction</h1></body></html>").asPlainText



trait SafeStringUtils {

  // Option에 감싸여 있는 문자열의 정리된 버전을 반환하거나,
  // 정리된 문자열의 값이 비었다면 None을 반환함.
  def trimToNone(s: String): Option[String] = {
    Option(s) map(_.trim) filterNot(_.isEmpty)
  }
}

class Page(val s: String) extends SafeStringUtils with HtmlUtils {
  def asPlainText: String = {
    trimToNone(s) map removeMarkup getOrElse "n/a"
  }
}

new Page("<html><body><h1>Introduction</h1></body></html>").asPlainText

new Page(" ").asPlainText

new Page(null).asPlainText



trait Base { override def toString = "Base" }

class A extends Base { override def toString = "A->" + super.toString }

trait B extends Base { override def toString = "B->" + super.toString }

trait C extends Base { override def toString = "C->" + super.toString }

class D extends A with B with C { override def toString = "D->" + super.toString }

new D()



class RGBColor(val color: Int) { def hex = f"$color%06X" }

val green = new RGBcolor(255 << 8).hex

trait Opaque extends RGBColor { override def hex = s"${super.hex}FF" }

trait Sheer extends RGBColor { override def hex = s"${super.hex}33" }



class Paint(color: Int) extends RGBColor(color) with Opaque

class Overlay(color: Int) extends RGBColor(color) with Sheer

val red = new Paint(128 << 16).hex

val blue = new Overlay(192).hex
