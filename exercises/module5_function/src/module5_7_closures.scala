//Module 5 Function
//Closure
//Author: Dr. Alfred Ang

object module5_7_closures {
   def main(args: Array[String]) {
      println(f(5))
   }
  
  var factor = 2
  var f = (x:Int) => x*x*factor
}