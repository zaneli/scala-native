package java.util

object LinkedListSuite extends tests.Suite {

  test("size()") {
    val l = new LinkedList[String]()
    assert(l.size() == 0)

    l.add("x")
    assert(l.size() == 1)

    l.addAll(Collections.nCopies(100, "x"))
    assert(l.size() == 1 + 100)

    l.addAll(Collections.nCopies(Int.MaxValue, "x"))
    assert(l.size() == Int.MaxValue)
  }
}
