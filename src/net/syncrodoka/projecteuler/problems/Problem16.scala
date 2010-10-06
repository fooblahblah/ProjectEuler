package net.syncrodoka.projecteuler.problems

object Problem16 {

	def main(args: Array[String]) = {
		println((BigInt(1) << 1000).toString.map(n => n.toString.toInt).sum)
	}
	
}