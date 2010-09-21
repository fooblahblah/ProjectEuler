package net.syncrodoka.projecteuler.problems

import net.syncrodoka.projecteuler.Numerics

object Problem7 {

	def main(args : Array[String]) = {
		val nthPrime = 10001
		var i = 2
		var j = 1
		
		while(j < nthPrime)
		{
			i += 1
			
			if(Numerics.primeFactors(i).length == 1)
			{
				j += 1
			}
		}
		
		println("Problem 7 = " + i)
	}
	
}