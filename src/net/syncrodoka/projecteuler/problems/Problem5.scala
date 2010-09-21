package net.syncrodoka.projecteuler.problems

object Problem5 {

	def main(args : Array[String]) = {
		println("Problem 5 = " + smallestEvenlyDivisible(20))
	}
	
	def smallestEvenlyDivisible(n : Int) : Int = {
		var k = n
		while((1 to n).exists(i => k % i != 0)) { k += 1 }
		k
	}
}