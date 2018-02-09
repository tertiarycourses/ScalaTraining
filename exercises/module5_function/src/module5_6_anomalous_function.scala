//Module 5 Function
//Anomalous Argument
//Author: Dr. Alfred Ang

object module5_6_anomalous_function {
  def main(args: Array[String]) {
//      println(f(5))
//    println(f(5,10))
      println(f(6, double))                        
      println(f(6, triple))
   }
  
//   def f( x:Int ) : Int = {
//      return x*x
//    }    
//  var f = (x:Int) => x*x
  
//   def f( x:Int,y:Int ) : Int = {
//      return 10*x+y
//    }    
//   
//   var f =  (x:Int,y:Int) => 10*x+y
   
  val double = (i:Int) => i * 2                   
  val triple = (i:Int) => i * 3                   
  
  def f(x:Int, y:Int=>Int) = y(x)       
                         
}