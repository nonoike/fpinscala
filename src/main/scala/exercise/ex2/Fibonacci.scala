package exercise.ex2

object Fibonacci extends App {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, before: Int, current: Int): Int = {
      if (n == 1) before
      else loop(n - 1, current, before + current)
    }

    if (n <= 0)
      throw new IllegalArgumentException(
        "value must be greater than or equal to 1")
    else loop(n, 0, 1)
  }
}
