// Basic Scala for Apache Spark
// Module 6 Object Oriented Programming
// Author: Dr. Alfred Ang

// class Animal() {

// 	 var legs = 4
// 	 var color = "white"

// 	 def talk() {
// 	 	println("talk like an animal")
// 	 }
// }

// class Counter() {
// 	var count = 0

// 	def increment() {
// 		count = count + 1

// 	}

// 	def incrementbyN(n:Int) {
// 		count = count + n

// 	}

// 	def reset() {
// 		count = 0

// 	}
// }

// //Testing
// var c1 = new Counter()
// println(c1.count)
// c1.increment()
// c1.increment()
// c1.increment()
// println(c1.count)
// c1.incrementbyN(10)
// println(c1.count)
// c1.reset()
// println(c1.count)


// class Animal(var legs:Int,var color:String) {

// 	 def talk() {
// 	 	println("talk like an animal")

// 	 }

// 	 def myinfo() {
// 	 	printf("I have %d legs\n",legs)
// 	 	printf("I am %s color \n",color)

// 	 }
// }

// class Dog(legs:Int, color:String, var name:String) extends Animal(legs,color){

// 	override def talk() {
// 		printf("%s woof woof woof\n",name)
// 	}

// }

// var d1 = new Dog(4,"grey","Ally")
// d1.talk()

// var a1 = new Animal(8,"black")
// a1.talk()
// a1.myinfo()

class Rectangle(var length: Int, var width: Int, var color:String) {

	def area() :Int = {
		return length*width
	}
} 

class Square(length:Int,color:String) extends Rectangle(length,length,color) {

	def perimeter() :Int =  {
		return 4*length

	}

	def dispColor() : Unit =  {
		printf("Color is %s\n",color)
	}
}

var s1 = new Square(20,"red")
println(s1.area())
println(s1.perimeter)
s1.dispColor()

// //Testing
// var r1 = new Rectangle(10,20)
// println(r1.area())

// var a1 = new Animal()
// println(a1.legs)
// println(a1.color)
// a1.talk()