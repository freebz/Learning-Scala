// 문자열 보간

val approx = 355/113f

println("Pi, using 355/113, is about " + approx + ".")


println(s"Pi, using 355/113, is about $approx.")


val item = "apple"

s"How do you like them ${item}s?"

s"Fish n chips n vinegar, ${"pepper "*3}salt"


val item = "apple"

f"I wrote a new $item%.3s today"

f"Enjoying this $item ${355/113.0}%.5f times today"
