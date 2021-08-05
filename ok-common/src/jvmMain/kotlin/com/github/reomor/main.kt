package com.github.reomor

import com.github.reomor.common.service.CommonService

actual fun main(): Unit {
  println("Hello World JVM ${CommonService().getSmth()}")
}
