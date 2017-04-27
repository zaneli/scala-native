package java.util

object LinkedListSuite extends tests.Suite {

  test("size()") {
    val l = new LinkedList[String]()
    assert(l.size() == 0)

    l.add("x")
    assert(l.size() == 1)
  }
}
