//Module 6 Object Oriented Programming
//Inheritance
//Author: Dr. Alfred Ang

class Dog(legs:Int,color:String,namev:String) extends Animal(legs,color) {
  
  var name = namev
  
  override def talk() {
    println(name + " woof woof woof")
  }
}

class Square(l:Int) extends Rect(l,l) { 
  
  def perimeter() : Int = {
    return length*4
  } 
  
  
}

object module6_2 {
    def main(args: Array[String]) {
      
//      var a1 = new Dog(4,"black","Ally")
//      a1.talk()
      
      var a1 = new Square(10)  
      println(a1.area())
      println(a1.perimeter())
    }   
}
