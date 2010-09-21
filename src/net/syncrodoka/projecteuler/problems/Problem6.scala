package net.syncrodoka.projecteuler.problems

import net.syncrodoka.projecteuler.Numerics

object Problem6 {

	def main(args : Array[String]) = {
		val n = 100
		println("Problem 6 = " + (Numerics.squareOfSums(n) - Numerics.sumOfSquares(n)))
	}
	
}