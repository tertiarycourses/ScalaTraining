// Basic Scala for Apache Spark
// Module 5 Function
// Author: Dr. Alfred Ang


// Block expression
// val a = 4

// var sum = 0 
// for (i <- 1 to 10) {
// 	sum += i

// }
// println(sum)

// println(
// 	{
// 	  var sum = 0 
//       for (i <- 1 to 10) {
//         sum += i
// 	    }
// 	  sum
// 	}
// )

//Function

// def f (x:Int) : Int = {
// 	return x*x
// }

// println(f(4))

// no return
// def greet (name:String) : Unit  = {
// 	println("Hello, "+name)
// }

// greet("Alfred")

// multiple return

// def f (x:Int) : (Int,Int) = {
// 	return (x*x,x*x*x)
// }

// println(f(3))

// Exercise
// def grocery(order:Double) : (Double,Double) = {

// 	var  discount = if (order>200) 25 else 0
// 	var disc_amt = discount*order/100
// 	var tax_amt = 0.07*(order-disc_amt)/100 
// 	return (disc_amt,tax_amt)

// }

//Testing
// var order:Double = 250
// var (discount,tax) = grocery(order)

// printf("Discount = $%.2f\n",discount)
// printf("Tax = $%.2f\n",tax)

// default argument
// def f (x:Int=3,y:Int=3) : Int = {
// 	return x*x+2*y
// }

// println(f(y=2))

// def sum(a:Int* ) : Int = {
// 	var s:Int = 0
// 	for (i <- a) {
// 		s = s+i
// 	}
// 	return s
// }

// println(sum(1,2,3,4,5,6,7,8,9,10))

// def min (a:Int* ) : Int = {
// 		var m:Int = a(0)
//  		for (i <- a) {
//           if (i<m) {
//           m = i
//         	}
//         }
//         return m
// }

// println(min(6,7,8,9,10))


// Lambda

// def f (x:Int) : Int = {
// 	return x*x
// }

// var f = (x:Int) => x*x

// println(f(3))

// val c = 10
// var double = (x:Double) => x*2*c
// var triple = (x:Double) => x*3*c
// var square = (x:Double) => x*x*c
// var cube = (x:Double) => x*x*x*c

// def f(x:Double,y:Double=>Double) = y(x)

// println(f(3,double))
// println(f(3,triple))
// println(f(3,square))
// println(f(3,cube))

// val c = 10

// def f (x:Int) :Int = {
// 	return x*x*c
// }

// println(f(4))
