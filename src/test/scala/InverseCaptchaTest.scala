import org.scalatest.FunSuite

class InverseCaptchaTest extends FunSuite {
  test("InverseCaptcha.solve") {
    val simpleExample = new InverseCaptcha("1122")
    assert(simpleExample.solve() === 3)
  }
}
