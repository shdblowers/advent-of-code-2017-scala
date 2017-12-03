import org.scalatest.FunSuite

class InverseCaptchaTest extends FunSuite {
  test("InverseCaptcha.solve simple") {
    val simpleExample: InverseCaptcha = InverseCaptcha("1122")
    assert(simpleExample.solve() === 3)
  }

  test("InverseCaptcha.solve none the same") {
    val willBeZero: InverseCaptcha = InverseCaptcha("123456789")

    assert(willBeZero.solve() === 0)
  }
}
