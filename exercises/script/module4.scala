// Basic Scala for Apache Spark
// Module 4; Loop
// Author: Dr. Alfred Ang

// while loop
// var a = 1
// while (a<10) {
// 	println(a)
// 	a = a + 1
// }

//Exercise
// var a = 0
// var temp = 0
// var b = 1

// while (a<100) {
// 	temp = a
// 	a = b
// 	b = temp+b
// 	println(a)
// }

// do-while loop
// var a = 1
// do {
// 	println(a)
// 	a = a + 1
// } while(a<10)

//for Loop
// val a = Array(2,3,4)
// val a = Vector(2,3,4)
// val a = Range(2,20,2)

// for (i <- a) {
// 	println(i)
// }

// for (i <- 1 to 10) {
// 	println(i)
// }

// for (i <- 1 to 20 by 2) {
// 	println(i)
// }
// for (i <- Range(1,30,3)) {
// 	println(i)
// }

// var name = Array("Ally","Belinda","Jane")
// var height = Array(160,155,178)

// var pair = name.zip(height)
// for ((n,h)<-pair) {
// 	println(n + " height is "+ h + "cm")
// }

// var name = Array("Ally","Belinda","Jane")
// var height = Array(160,155,178)
// var weight = Array(55,65,60)

// var pair = height.zip(weight).zip(name)

// for (((h,w),n)<-pair) {
// 	println(n + " height is "+ h + "cm"+ " weight is " + w + "kg")
// }

// var b = new Array[Int](10)
// for (i <- Range(1,10)) {
// 	b(i) = i*i
// }
// println(b.toVector)

//for comprehension loop
// var b = for (i <- 0 to 9) yield i*i
// println(b) 

// foreach loop
// var sum = 0 
// (1 to 10 by 2).foreach(println)
// println(sum)