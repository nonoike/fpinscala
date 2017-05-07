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

  "dropWhile" should "Nilと1を渡すとNilを返す" in {
    assert(List.dropWhile(Nil, (a: Int) => a == a) === Nil)
  }

  it should "List{1,1,2,3}と(a == 1)を渡すとList{2, 3}を返す" in {
    assert(List.dropWhile(List(1, 1, 2, 3), (a: Int) => a == 1) === List(2, 3))
  }

  it should "List{1,1,1,1}と(a == 1)を渡すとNilを返す" in {
    assert(List.dropWhile(List(1, 1, 1, 1), (a: Int) => a == 1) === Nil)
  }

  it should "List{1,2,3,4}と(a == 5)を渡すとList{1, 2, 3, 4}を返す" in {
    assert(List.dropWhile(List(1, 2, 3, 4), (a: Int) => a == 5) === List(1, 2, 3, 4))
  }
}
