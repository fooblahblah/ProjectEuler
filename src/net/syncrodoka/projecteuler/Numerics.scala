package net.syncrodoka.projecteuler

object Numerics {

	def primeFactors(n:Long) : List[Long] = {
		def findPrimeFactors(n : Long, factors : List[Long]) : List[Long] = {
			for(i <- 2L to Math.sqrt(n).longValue) {
				if(n % i == 0) {
					return findPrimeFactors(n / i, factors :+ i)
				}				
			}
			factors :+ n
		}
		findPrimeFactors(n, List())
	}

	def factors(n:Long) : List[Tuple2[Long, Long]] = {
		def findFactors(n : Long, i : Long, factors : List[Tuple2[Long, Long]])
			: List[Tuple2[Long, Long]] = {
			if(i > 1)
			{
				val newFactors = if(n % i == 0) {
					factors :+ (i, n / i)
				} else {
					factors
				}
				findFactors(n, i - 1, newFactors)
			} else {
				factors
			}
		}
		findFactors(n, Math.sqrt(n).longValue, List())
	}
	
	def sumOfSquares(n : Int) : Int = {
		squares(1).take(n).sum
	}
	
	def squareOfSums(n : Int) : Int = {
		Math.pow(from(1).take(n).sum, 2).intValue
	}
	
	def squares(n : Int) : Stream[Int] = {
		Stream.cons(n * n, squares(n + 1))
	}

	def from(n : Int) : Stream[Int] = {
		Stream.cons(n, from(n + 1))		
	}
}
