package net.syncrodoka.projecteuler
import org.junit.Test
import org.junit.Assert._

import net.syncrodoka.projecteuler.problems._
import org.scalatest.junit.AssertionsForJUnit

class EulerTest extends AssertionsForJUnit {

//	@Test
	def solveProblem1() = {
		val prob = new Problem1
		println("problem 1 = " + prob.sumMultiple(Array(3,5), 1000))
	}
	
//	@Test
	def solveProblem2() = {
		val prob = new Problem2
		println("problem 2 = " + prob.fib(4000000))
	}
	
//	@Test
	def solveProblem3() = {
		val prob = new Problem3
		println("problem 3 = " + prob.solve(600851475143L))
	}

	@Test
	def solveProblem4() = {
		val n = 997799
		println("Factors " + Numerics.factors(n))
		val prob = new Problem4
		println("problem 4 = " + prob.largestPalindrome(n))
	}
}