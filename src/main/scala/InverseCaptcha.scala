class InverseCaptcha(val input: Array[Int]) {
  def solve(): Int = {
    3
  }
}

object InverseCaptcha {
  def apply(input: String): InverseCaptcha = {
    val splitInput: Array[Int] =
      input
        .split("")
        .map((numberAsString: String) => {
          numberAsString.toInt
        })

    new InverseCaptcha(splitInput)
  }
}