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
		def findFactors(n : Long, i : Long, factors : List[Tuple2[Long, Long]]) : List[Tuple2[Long, Long]] = {
			println("findFactors " + n + ", " + i + ", " + factors)
			if(i > 1)
			{
				if(n % i == 0) {
					findFactors(n, i - 1, factors :+ (i, n / i))
				} else {
					findFactors(n, i - 1, factors)
				}
			} else {
				factors
			}
		}
		findFactors(n, Math.sqrt(n).longValue, List())
	}
}