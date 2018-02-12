//Module 6 Object Oriented Programming
//Author: Dr. Alfred Ang

//class Animal() {
//  var legs = 4
//  var color = "white"
//  
//  def talk() {
//    println("talk like an animal")
//  }
//}

//class Counter() {
//  var count = 0
//  
//  def increment() {
//    count = count +1
//  }
//  
//  def incrementByN(n:Int) {
//    count = count + n
//  }
//  
//  def reset() {
//    count = 0
//  }
//  
//}

//class Animal(var legs:Int,var color:String) {
//
//  def talk() {
//    println("talk like an animal")
//  }
//}

//class Animal() {
//  var legs = 4
//  var color = "white"
//  
//  def talk() {
//    println("talk like an animal")
//  }
//}

//class Counter() {
//  var count = 0
//  
//  def increment() {
//    count = count +1
//  }
//  
//  def incrementByN(n:Int) {
//    count = count + n
//  }
//  
//  def reset() {
//    count = 0
//  }
//  
//}

class Animal(var legs:Int,var color:String) {

  def talk() {
    print("talk like an animal")
  }
}

class Rect(var length:Int, var width:Int) { 

  def area() : Int = {
    return length*width
  } 
}

class Dog(legs:Int, color:String,var name :String) extends Animal(legs,color) {
  
  override def talk() {
    println(name + " woof woof woof")
  }
}

class Square(length:Int) extends Rect(length,length) { 
  
  def perimeter() : Int = {
    return length*4
  } 
  
  
}


object module6_1 {
    def main(args: Array[String]) {
      
//      var a1 = new Animal()
//      a1.talk()
//      
//      Exercise
//      var c1 = new Counter()
//      
//      // Testing
//      print(c1.count)
//      c1.increment()
//      c1.increment()
//      c1.increment()
//      print(c1.count)
//      c1.incrementByN(10)
//      print(c1.count)
//      c1.reset()
//      print(c1.count)
      
//      var a1 = new Animal(4,"white")
//      print(a1.legs)
//      print(a1.color)
      
//      x`x`Exercise
//      val r1 = new Rect(10,20)  
//      print(r1.area())
      
      
//      var a1 = new Dog(4,"black","Ally")
//      a1.talk()
      
      var a1 = new Square(10)  
      println(a1.area())
      println(a1.perimeter())
    }   
}
