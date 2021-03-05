package main

import scala.io.Source

object Main extends App {
  if (args.length < 1) throw new IllegalArgumentException("Missing file path argument")
  val scorer = new Scorer
  for (line <- Source.fromFile(args(0)).getLines) {
    val names = scorer.stringToNames(line)
    val scores = names.zipWithIndex.map{ case (name, i) => name.calculate(i) }
    scores.foreach(println(_))
    println(scores.sum)
  }
}

class Scorer {
  def stringToNames(input: String): Array[Name] = {
    input.replaceAll("\"", "").split(",").map(x => new Name(x))
  }
}
class Name(first: String) {
  override def toString = s"$first"
  def calculate(index: Int) = {
    val sum = Alpha.sumAlpha(first)
    println("Sum for " + first + " was " + sum)
    sum * (index + 1)
  }
}

object Alpha {
  def sumAlpha(input: String) = input.toLowerCase.toList.map(_.toInt - 96).sum
}
