package net.syncrodoka.projecteuler.problems

import net.syncrodoka.projecteuler.Numerics._

object Problem14 {
	
	def maxHailstone(n: Int): Int = {
		def wrapper(i: Int, longest: (Int, Int) ): Int = i match {
			case j if i < n => 
				val m = hailstone(j).length
				wrapper(i + 1, if(m > longest._2) (i, m) else longest)
			case _ => longest._1
		}
		
		wrapper(1, (1, 1))
	}
	
	def main(args: Array[String]) = {
		println(maxHailstone(999999))
	}
}
