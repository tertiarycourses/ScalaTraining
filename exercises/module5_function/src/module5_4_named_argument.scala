//Module 5 Function
//Named Argument
//Author: Dr. Alfred Ang

object module5_4_named_argument {
   def main(args: Array[String]) {
      println(f(y=3,x=2))
   }
   
   def f( x:Int = 5, y:Int = 7 ) : Int = {
      return 2*x+3*y
   }
}