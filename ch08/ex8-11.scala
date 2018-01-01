// 프라이버시 접근 변경자

:paste -raw
// Entering paste mode (ctrl-D to finish)

package com.oreilly {

  private[oreilly] class Config {
    val url = "http://localhost"
  }

  class Authentication {
    private[this] val password = "jason" // 할 일: 이 부분 변경할 것
    def validate = password.size > 0
  }

  class Test {
    println(s"url = ${new Config().url}")
  }
}

// Existing paste mode, now interpreting.

val valid = new com.oreilly.Authentication().validate

new com.oreilly.Test

new com.oreilly.Config
