import Examples._

object Main {

  def main(args: Array[String]): Unit = {

    val num = List(1, 2, 3, 4)

    val r = sumFold(num)

    println(r)    // 10

    // Folding left and right

    val fLeft = num.foldLeft(0)((n, e) => n + e)
    println(fLeft) // 10

    val fRight = num.foldRight(0)((n, e) => n + e)
    println(fRight) // 10

    val letters = List("a", "b", "c", "d")

    val fLeftLetters = letters.foldLeft("")((neutralElement, e) => s"$neutralElement $e")
    println(fLeftLetters) // a b c d

    val fRightLetters = letters.foldRight("")((e, neutralElement) => s"$neutralElement $e")
    println(fRightLetters) // d c b a

  }

}
