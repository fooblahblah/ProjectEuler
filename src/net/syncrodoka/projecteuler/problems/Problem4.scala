package net.syncrodoka.projecteuler.problems

class Problem4 {
	
	def largestPalindrome(n : Int) : Int = {
		if(isPalindrome(n))
			n
		else
			largestPalindrome(n - 1)
	}

	def isPalindrome(n : Int) : Boolean = {
		n.toString.reverse == n.toString
	}	
}