import org.scalatest.FunSuite

class MainTest extends FunSuite {
  test("Main.add") {
    assert(Main.add(2, 3) === 5)
  }
}
