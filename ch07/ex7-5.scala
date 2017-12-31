// 배열

val colors = Array("red", "green", "blue")

colors(0) = "purple"

colors

println("very purple: " + colors)

val files = new java.io.File(".").listFiles

val scala = files map (_.getName) filter(_ endsWith "scala")
