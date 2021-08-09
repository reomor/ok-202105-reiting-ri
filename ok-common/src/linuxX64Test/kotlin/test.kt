import com.github.reomor.service.PlatformService
import com.github.reomor.service.SuspendPlatformService
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertTrue

class LinuxX64Test {

  @Test
  fun testPlatform() {
    assertTrue {
      PlatformService().getPlatform().contains("Linux")
    }
  }

  @Test
  fun testPlatformSuspend() = runBlocking {
    assertTrue {
      SuspendPlatformService().getPlatformSuspend().contains("Suspend")
    }
  }
}
