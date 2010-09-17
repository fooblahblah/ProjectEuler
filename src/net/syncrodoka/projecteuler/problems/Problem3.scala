package net.syncrodoka.projecteuler.problems

import net.syncrodoka.projecteuler.Numerics

class Problem3 {
	def solve(n : Long) : List[Long] = {
		Numerics.primeFactors(n)
	}
}