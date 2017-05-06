package exercise.ex3

import org.scalatest.FlatSpec

class ListSpec extends FlatSpec {

  "drop" should "Nilと1を渡すとNilを返す" in {
    assert(List.drop(Nil, 1) === Nil)
  }

  it should "List{1, 2, 3, 4}と0を渡すとList{1, 2, 3, 4}を返す" in {
    assert(List.drop(List(1, 2, 3, 4), 0) === List(1, 2, 3, 4))
  }

  it should "List{1, 2, 3, 4}と-1を渡すとList{1, 2, 3, 4}を返す" in {
    assert(List.drop(List(1, 2, 3, 4), -1) === List(1, 2, 3, 4))
  }

  it should "List{1, 2, 3, 4}と2を渡すとList{3, 4}を返す" in {
    assert(List.drop(List(1, 2, 3, 4), 2) === List(3, 4))
  }

  it should "List{1, 2, 3, 4}と5を渡すとNilを返す" in {
    assert(List.drop(List(1, 2, 3, 4), 5) === Nil)
  }
}
