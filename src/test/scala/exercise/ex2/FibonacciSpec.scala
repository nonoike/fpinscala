package exercise.ex2

import org.scalatest._

class FibonacciSpec extends FlatSpec with DiagrammedAssertions {
  "fib" should "1を渡すと0を返す" in {
    assert(Fibonacci.fib(1) === 0)
  }

  it should "2を渡すと1を返す" in {
    assert(Fibonacci.fib(2) === 1)
  }

  it should "10を渡すと34を返す" in {
    assert(Fibonacci.fib(10) === 34)
  }

  it should ("0以下を渡すと例外を投げる") in {
    intercept[IllegalArgumentException] {
      Fibonacci.fib(0)
    }
    intercept[IllegalArgumentException] {
      Fibonacci.fib(-1)
    }
  }
}
