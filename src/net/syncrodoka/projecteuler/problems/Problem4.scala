package net.syncrodoka.projecteuler.problems

import net.syncrodoka.projecteuler.Numerics

class Problem4 {
	
	def largestPalindrome(i : Int) : Int = {
		def tailLargestPalindrome( n : Int) :Int = {
			if(isPalindrome(n) && isThreeDigitProduct(n)) {
				n
			} else {
				tailLargestPalindrome(n - 1)
			}
		}
		tailLargestPalindrome(i)
	}

	def isPalindrome(n : Int) : Boolean = {
		n.toString.reverse == n.toString
	}	
	
	def isThreeDigitProduct(n : Int) : Boolean = {
		val factors = Numerics.factors(n)
		factors.exists(t => t._1.toString.length == 3 && 
				t._2 .toString.length == 3)
	}
}

object Main {
  def main(args:Array[String]) = {
	  val n = 999*999
	  val prob = new Problem4
	  println("problem 4 = " + prob.largestPalindrome(n))
  }
}