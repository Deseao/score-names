package main

import scala.io.Source
import scala.util.Sorting

import name.Name

object Main extends App {
  if (args.length < 1) throw new IllegalArgumentException("Missing file path argument") //TODO find a better way to display an error and end execution than throwing an exception
  println(Scorer.scoreFile(args(0)))
}

object Scorer {
  def scoreFile(fileName: String) =  stringToNames(Source.fromFile(fileName).getLines.next).zipWithIndex.map{case (name, i) => name.calculate(i) }.sum
  def stringToNames(input: String) = {
    val names = input.replaceAll("\"", "").split(",")
    Sorting.quickSort(names) //TODO: There must be a way to do this as part of a function chain rather than its own line
    names.map(new Name(_))
  }
}