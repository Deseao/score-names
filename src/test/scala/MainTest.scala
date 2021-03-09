package main

import org.scalatest.funsuite._
import score.AlphaPositional

class MainTest extends AnyFunSuite {
    test("Scorer.scoreFile") {
        assert(Scorer.scoreFile("./test-names.txt", AlphaPositional) === 3194)
        assert(Scorer.scoreFile("./names.txt", AlphaPositional) === 871198282)
    }
}