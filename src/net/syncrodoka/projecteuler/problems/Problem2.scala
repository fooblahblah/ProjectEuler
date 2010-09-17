package net.syncrodoka.projecteuler.problems

class Problem2 {
	def fib(n:Int) = {
		lazy val fib: Stream[Int] = Stream.cons(0, Stream.cons(1, fib.zip(fib.tail).map(p => p._1 + p._2)))
		fib.filter(_ % 2 == 0).takeWhile(_ <= 4000000).foldLeft(0)(_ + _)
	}
}