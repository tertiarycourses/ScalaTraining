//Module 2 Data Types
//Author: Dr. Alfred Ang

object module2_1 {
  def main(args: Array[String]) {

// Variable and Numbers
//  var a = 1
//  var b = 2.3
//  var c = a+b
//  println(c)
//  printf("%d + %f = %f",a,b,c)

 //Type Cast
// 	var a: Int = 1
// 	var a = 2.4

// Constant
// val a = 1
// a = 3

//Exercise: Number
//var a = 4.444
//var b = 5.555
//var c = 6.6666
//var d = a + b +c
//printf("%f + %f + %f = %f",b,c,a,d)  

//String
//var greet = "Hello"
//var name = "Alfred"
//println(greet+" "+ name)
//println("My name is "+name)
//printf("My name is %s",name)
    
//Exercise: String 
//var country ="france"
//var capital ="paris"
//println("The capital of "+ country +" is "+ capital)
//printf("The capital of %s is %s",country,capital)
    
//Array
//var a = Array(1,2,10)
//a(0) = 4
//println(a(0))

//List
//  var a = List(1,2,3)
//  print(a)
//  a(1) = 4
//  println(a(0))

//    var a = 1::2::3::Nil
//    print(a)
    
//    var a = List.range(1,10,2)
//    print(a)


//Set
//  var a = Set(1,2,3,2)
//  var b = Set(4,4,5,6,1,2)
//  println(a)
//  println(a.contains(2))
//  println(a ++ b)
//  println(a & b)
    
//Map
//  var colors = Map("red" -> "#FF0000", "green" -> "#00FF00", "blue" -> "#0000FF")
//  println(colors.get("red"))
//  colors = colors + ("white" -> "#FFFFFF")
//  println(colors.get("white"))
    
//Tuple
//  var (first,second, third) = (1,1.2,"hello")    
//  println(third) 
  
 var a = true
 var b = false
 
 println(a || b)
 println(a && b)
 println(!a)
  }
}