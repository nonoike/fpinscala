package exercise.ex22

import org.scalatest.FlatSpec

class SortUtilSpec extends FlatSpec {
  "isSorted" should "ソート済みならばtrueを返す" in {
    val ints = Array(1, 1, 2)

    def ordered(a: Int, b: Int) = a <= b

    assert(SortUtil.isSorted(ints, ordered) === true)
  }

  "isSorted" should "未ソートならばfalseを返す" in {
    val strings = Array("b", "a", "c")

    def ordered(a: String, b: String) = a <= b

    assert(SortUtil.isSorted(strings, ordered) === false)
  }
}
