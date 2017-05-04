package exercise.ex21

object Fibonacci {
  def main(args: Array[String]): Unit = println(fib(10))

  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, before: Int, current: Int): Int = {
      if (n == 1) before
      else loop(n - 1, current, before + current)
    }

    if (n <= 0) throw new Exception("")
    else loop(n, 0, 1)
  }
}
