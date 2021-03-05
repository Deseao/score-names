package name

class Name(first: String) {
  override def toString = s"$first"
  def calculate(index: Int) = Alpha.sumAlpha(first) * (index + 1)
}

object Alpha {
  def sumAlpha(input: String) = input.toLowerCase.toList.map(_.toInt - 96).sum
}