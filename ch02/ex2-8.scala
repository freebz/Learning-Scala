// 정규 표현식

val input = "Enjoing this apple 3.14159 times today"

val pattern = """.* apple ([\d.]+) times .*""".r

val pattern(amountText) = input

val amount = amountText.toDouble
