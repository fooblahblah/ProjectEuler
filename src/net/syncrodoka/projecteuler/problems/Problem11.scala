package net.syncrodoka.projecteuler.problems

object Problem11 
{
	def main(args : Array[String]) = {
		val s = List(1 to 3, 4 to 6, 7 to 9)
		
		s.grouped(1).foreach(n => println(n))
	}
}