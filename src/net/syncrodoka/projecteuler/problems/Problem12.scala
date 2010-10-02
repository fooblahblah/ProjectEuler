package net.syncrodoka.projecteuler.problems

import net.syncrodoka.projecteuler.Numerics

object Problem12 {

	def main(args: Array[String]) = {			
		val i = Numerics.from(BigInt(1)).map(n => BigInt(1) to n).map(m => m.sum).
			dropWhile(o => Numerics.factors(o).length * 2 < 500).iterator
		println(i.next)
	}
}