//Module 5 Function
//Default Argument
//Author: Dr. Alfred Ang

object module5_3_default_arguments {
   def main(args: Array[String]) {
      println(f())
   }
   
   def f( x:Int = 5, y:Int = 7 ) : Int = {
      return 2*x+3*y
   }
}