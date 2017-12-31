// 퓨처 컬렉션

import concurrent.ExecutionContext.Implicits.global

val f = concurrent.Future { println("hi") }



val f = concurrent.Future { Thread.sleep(5000); println("hi") }

println("waiting")
