//Module 5 Function
//Variable Argument
//Author: Dr. Alfred Ang

object module5_5_variable_arguments {
     def main(args: Array[String]) {
      println(sum(1,2,3,4,5))
      println(min(1,2,3,4,5))
   }
   
   def sum(x:Int*) : Int = {
      var s:Int = 0
      for (i <- x) {
          s = s + i 
        }
      return s
     }
   
    def min(x:Int*) : Int = {
      var m:Int = x(0)
      for (i <- x) {
          if (i<m) {
          m = i
        }
      }
      return m
     }
}