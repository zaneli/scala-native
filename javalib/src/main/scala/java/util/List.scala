package java.util

trait List[E] extends Collection[E] {
  def size(): Int
  def isEmpty(): Boolean
  def iterator(): Iterator[E]
  def get(index: Int): E
  def set(index: Int, element: E): E
  def add(e: E): Boolean
  def add(index: Int, element: E): Unit
  def remove(index: Int): E
  def size(): Int
  def isEmpty(): Boolean
  def indexOf(o: Any): Int
  def lastIndexOf(o: Any): Int
  def iterator(): Iterator[E]
  def listIterator(): ListIterator[E]
  def listIterator(index: Int): ListIterator[E]
  def subList(fromIndex: Int, toIndex: Int): List[E]
  def addAll(index: Int, c: Collection[_ <: E]): Boolean
  def clear(): Unit
}
