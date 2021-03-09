package score

import name.Name

class AlphaPositionalTest extends org.scalatest.funsuite.AnyFunSuite {
    test("AlphaPositional.calculate") {
        val Alex = new Name("ALEX")
        assert(AlphaPositional.calculate(Alex, 0) === 42)
        val lowerAlex = new Name("alex")
        assert(AlphaPositional.calculate(lowerAlex, 0) === 42)
        assert(AlphaPositional.calculate(Alex, 1) === 84)
        val Linda = new Name("LINDA")
        assert(AlphaPositional.calculate(Linda, 0) === 40)
        assert(AlphaPositional.calculate(Linda, 3) === 160)
    }
}