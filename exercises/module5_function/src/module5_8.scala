//Module 5 Function
//Recursive function
//Author: Dr. Alfred Ang

object module5_8 {
   
  def main(args: Array[String]) {
      println(factorial(5))
   }
  
  def factorial(n:Int):Int = if(n<=0) 1 else n * factorial(n-1) 
}