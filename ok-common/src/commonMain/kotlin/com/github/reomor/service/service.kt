package com.github.reomor.service

expect class PlatformService {
  fun getPlatform(): String
}

expect class SuspendPlatformService {
  suspend fun getPlatformSuspend(): String
}
