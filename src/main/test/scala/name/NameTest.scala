import org.scalatest.FunSuite

class AlphaTest extends FunSuite {
    test("Alpha#sumAlpha") {
        assert(Alpha.sumAlpha("ALEX") === 43)
    }
}