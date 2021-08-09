package com.github.reomor.service

import kotlinx.coroutines.delay

actual class PlatformService {
  actual fun getPlatform(): String = "JVM"
}

actual class SuspendPlatformService {
  actual suspend fun getPlatformSuspend(): String {
    delay(500)
    return "Suspend JVM"
  }
}
