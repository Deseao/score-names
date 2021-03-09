package name

import org.scalatest.funsuite._

class NameTest extends AnyFunSuite {
    test("Name.toString"){
        assert(new Name("ALEX").toString === "ALEX")
    }

}