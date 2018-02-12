// Basic Scala for Apache Spark
// Module 8: Parallel Programming with Scala
// Author: Dr. Alfred Ang

val a = 1 to 10000

def square (x:Int) : Int =  {
	return x*x
}

// val v = a.par

//println(a.map(square(_)))
//println(v.map(square(_)))

import scala.collection.parallel.immutable.ParVector

val v = ParVector.range(1,10000)
println(v.map(square(_)))
