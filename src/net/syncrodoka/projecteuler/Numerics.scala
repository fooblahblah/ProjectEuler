package net.syncrodoka.projecteuler

object Numerics {

  def primeFactors(n: Long): List[Long] = {
    def findPrimeFactors(n: Long, factors: List[Long]): List[Long] = {
      for (i <- 2L to Math.sqrt(n).longValue) {
        if (n % i == 0) {
          return findPrimeFactors(n / i, factors :+ i)
        }
      }
      factors :+ n
    }
    findPrimeFactors(n, List())
  }

  def factors(n: Long): List[Tuple2[Long, Long]] = {
    def findFactors(n: Long, i: Long, factors: List[Tuple2[Long, Long]]): List[Tuple2[Long, Long]] = i match {
    	case i if i > 0 && n % i == 0 => findFactors(n, i - 1, factors :+ (i, n / i))
    	case i if i > 0 => findFactors(n, i - 1, factors)
    	case _ => factors
    }
    findFactors(n, Math.sqrt(n).longValue, List())
  }

  def factors(n: BigInt): List[Tuple2[BigInt, BigInt]] = {
    def findFactors(n: BigInt, i: BigInt, factors: List[Tuple2[BigInt, BigInt]]): List[Tuple2[BigInt, BigInt]] = i match {
    	case i if i > 0 && n % i == 0 => findFactors(n, i - 1, factors :+ (i, n / i))
    	case i if i > 0 => findFactors(n, i - 1, factors)
    	case _ => factors
    }
    findFactors(n, BigInt.apply(Math.sqrt(n.toDouble).toLong), List())
  }

  def gcd(n: Int, m: Int): Int = {
    val l = List(m, n)
    val diff = l.max - l.min
    if (diff > 0) gcd(l.min, diff)
    else l.max
  }

  def sumOfSquares(n: Int): Int = {
    squares(1).take(n).sum
  }

  def squareOfSums(n: Int): Int = {
    Math.pow(from(1).take(n).sum, 2).intValue
  }

  def squares(n: Int): Stream[Int] = {
    Stream.cons(n * n, squares(n + 1))
  }

  def from(n: Int): Stream[Int] = {
    Stream.cons(n, from(n + 1))
  }

  def from(n: Long): Stream[Long] = {
    Stream.cons(n, from(n + 1))
  }

  def from(n: BigInt): Stream[BigInt] = {
    Stream.cons(n, from(n + 1))
  }

  def primes(k : Long) : Seq[Long] = {
	  (2L to k).filterNot(n => (2L until Math.sqrt(0.5 + n).ceil.longValue).exists(m => n % m == 0))
  }

  def pythagoreanTriple(m: Int, n: Int): (Int, Int, Int) = {
    ((m * m) - (n * n), 2 * m * n, (m * m) + (n * n))
  }
  
  def hailstone(n: Long): Stream[Long] = n match {
	  case 1 => Stream.cons(1, Stream.empty)
	  case n if n % 2 == 0 => Stream.cons(n, hailstone(n / 2))
	  case _ => Stream.cons(n, hailstone((3 * n) + 1))
  }
}
