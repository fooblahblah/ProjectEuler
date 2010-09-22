package net.syncrodoka.projecteuler.problems

import net.syncrodoka.projecteuler.Numerics

object Problem10 
{
	def main(args : Array[String]) = {
		val k = Numerics.primes(2000000L).sum
		println("Problem 10: " + k)
	}
}