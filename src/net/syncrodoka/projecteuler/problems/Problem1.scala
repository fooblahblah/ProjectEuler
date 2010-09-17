package net.syncrodoka.projecteuler

class Problem1 {

	def sumMultiple(mods : Array[Int], max : Int) : Int = {
		var total = 0
		0.until(max).foreach { 
			i => if(mods.exists { m => i % m == 0 }) total += i
		}
		total
	}
	
}