import org.scalatest.FunSuite

import name.Name

class AlphaPositionalTest extends FunSuite {
    test("AlphaPositional#calculate") {
        assert(AlphaPositional.calculate(new Name("ALEX"), 1) === 42)
    }
}