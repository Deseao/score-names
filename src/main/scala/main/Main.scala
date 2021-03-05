package main

import scala.io.Source
import scala.util.Sorting

import name.Name
import score.AlphaPositional
import score.ScoringStrategy

object Main extends App {
  if (args.length < 1) println("Missing file path argument")
  else println(Scorer.scoreFile(args(0), AlphaPositional))
}

object Scorer {
  def scoreFile(fileName: String, strategy: ScoringStrategy) =  namesToScore(stringToNames(readFile(fileName)), strategy)
  private def readFile(fileName: String): String = Source.fromFile(fileName).getLines().next()
  private def namesToScore(names: List[Name], strategy: ScoringStrategy): Int = names.zipWithIndex.map{case(name, i) => strategy.calculate(name, i)}.sum
  private def stringToNames(input: String): List[Name] = {
    val names = input.replaceAll("\"", "").split(",")
    Sorting.quickSort(names) //TODO: There must be a way to do this as part of a function chain rather than its own line
    names.toList.map(new Name(_)) 
  }
}