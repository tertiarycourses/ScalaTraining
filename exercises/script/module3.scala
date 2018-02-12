// Basic Scala for Apache Spark
// Module 3: Conditoinal
// Author: Dr. Alfred Ang

// val a = 2
// val b = 2

// if (a<b) {
// 	println("a is smaller than b")
// } else if (a>b) {
// 	println("a is larger than b")
// } else {
// 	println("a is same as b")
// }

import io.Source._

// val order = 300
// print("Enter your order : ")
// val order = readDouble()
// val discount = if (order >200) 25 else 0
// println(discount)

var grade = readLine("Enter your grade : ")
grade = grade.toUpperCase

if (grade == "A") {
	println("Excellent!")
} else if (grade == "B") {
	println("Well Done!")
} else if (grade == "C") {
	println("Work harder")
} else {
	println("Not sure your grade")
}




