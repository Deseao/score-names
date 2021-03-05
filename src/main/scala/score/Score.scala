package score

import name.Name

//When the other department needs to implement their more complex scoring algorithm, they can extend this trait to allow the calling the existing functions with no breakage
trait ScoringStrategy {
  def calculate(name: Name, index: Int): Int
}

object AlphaPositional extends ScoringStrategy {
  def calculate(name: Name, index: Int) = sumAlpha(name.first) * (index + 1)
  private def sumAlpha(input: String) = input.toLowerCase.toList.map(_.toInt - 96).sum
}