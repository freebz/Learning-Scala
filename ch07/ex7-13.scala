// 동기식으로 퓨처 처리하기

import concurrent.duration._

val maxTime = Duration(10, SECONDS)

val amount = concurrent.Await.result(nextFtr(5), maxTime)

val amount = concurrent.Await.result(nextFtr(5), maxTime)
