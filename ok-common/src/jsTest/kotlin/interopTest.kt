import com.github.reomor.js.JsBigDecimal
import kotlin.math.E
import kotlin.test.Test
import kotlin.test.assertEquals

class interopTest {
  @Test
  fun bigDecimalTest() {
    val bd = JsBigDecimal("${E * 10000}")
    println("BigDeciaml: ${bd.getValue()}")
    println("PrettyBigDeciaml: ${JsBigDecimal.getPrettyValue(bd.getValue(),1, "/")}")
    assertEquals("27183", bd.round().getValue())
  }
}