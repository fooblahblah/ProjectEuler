package net.syncrodoka.projecteuler.problems

import net.syncrodoka.projecteuler.Numerics

object Problem9 {

	def main(args : Array[String]) = {
		
		for(i <- 3 to 25;
			j <- 2 to 25) {
		
			val (a,b,c) = Numerics.pythagoreanTriple(i,j)
			if(a+b+c == 1000)
				println(a*b*c)
		}
	}
}