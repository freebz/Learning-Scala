// 리스트 매핑

List(0, 1, 0) collect { case 1 => "ok" }

List("milk,tea") flatMap (_.split(','))

List("milk","tea") map (_.toUpperCase)
