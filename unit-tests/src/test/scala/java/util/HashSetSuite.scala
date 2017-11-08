package java.util

object HashSetSuite extends tests.Suite {
  test("iterator.next()") {
    val hs = new HashSet[Int]()
    hs.add(1)
    hs.add(2)

    val itr = hs.iterator()
    assert(itr.hasNext)
    assert(itr.next() == 1)
    assert(itr.hasNext)
    assert(itr.next() == 2)
    assert(!itr.hasNext)
    assertThrows[NoSuchElementException](itr.next())
  }
}
