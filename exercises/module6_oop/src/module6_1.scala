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

class Counter() {
  var count = 0
  
  def increment() {
    count = count +1
  }
  
  def incrementByN(n:Int) {
    count = count + n
  }
  
  def reset() {
    count = 0
  }
  
}

class Animal(l:Int,c:String) {
  var legs = l
  var color = c
  
  def talk() {
    println("talk like an animal")
  }
}

class Rect(l:Int,w:Int) { 
  var length = l
  var width = w
  
  def area() : Int = {
    return length*width
  } 
}


object module6_1 {
    def main(args: Array[String]) {
      
//      var a1 = new Animal()
//      a1.talk()
      
//      Exercise
//      var c1 = new Counter()
//      
//      // Testing
//      println(c1.count)
//      c1.increment()
//      c1.increment()
//      c1.increment()
//      println(c1.count)
//      c1.incrementByN(10)
//      println(c1.count)
//      c1.reset()
//      println(c1.count)
      
//      var a1 = new Animal(4,"white")
//      println(a1.legs)
//      println(a1.color)
      
//      Exercise
//      var a1 = new Rect(10,20)  
//      println(a1.area())
    }   
}
