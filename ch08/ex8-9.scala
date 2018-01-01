// 패키징 구문

:paste -raw
// Entering paste mode (ctrl-D to finish)

package com.oreilly {
  class Config(val baseUrl: String = "http://localhost")
}


// Existing paste mode, now interpreting.

val url = new com.oreilly.Config().baseUrl



:paste -raw
// Entering paste mode (ctrl-D to finish)

package com {
  package oreilly {
    class Config(val baseUrl: String = "http://localhost")
  }
}

// Existing paste mode, now interpreting.

val url = new com.oreilly.Config().baseUrl
