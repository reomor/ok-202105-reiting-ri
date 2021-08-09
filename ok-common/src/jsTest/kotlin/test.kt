import com.github.reomor.service.PlatformService
import com.github.reomor.service.SuspendPlatformService
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.promise
import kotlin.test.Test
import kotlin.test.assertTrue

class JvmTest {

  @Test
  fun testPlatform() {
    assertTrue {
      PlatformService().getPlatform().contains("JS")
    }
  }

  @Test
  fun testPlatformSuspend() = MainScope().promise {
    assertTrue {
      SuspendPlatformService().getPlatformSuspend().contains("Suspend")
    }
  }
}
