//Module 5 Function
//Author: Dr. Alfred Ang

object module5_1 {
    def main(args: Array[String]) {
      // println(f(3))
      // print(f2(3))
      // print(f())
      // print(f(y=3,x=2))
      // print(sum(1,2,3,4,5))
      // print(min(1,2,3,4,5))
      // print(f(5))
	  // print(f(5,10))
      // print(f(6, double))                        
      // print(f(6, triple))
      // print(f(5))
      // print(factorial(5))
    }
    
   //  def f( x:Int ) : Int = {
   //    return x*x
   //  }       
    
   // No Return
   //  def hello(): Unit = {
   //   print("Hello")
   // }

  
   // Multiple Return
   // var (discount,tax) = grocery(300)
   //   println(discount)
   //   println(tax)
   //  }
   
   // def f2(x:Int ) : (Int,Int) = {
   //    return (x*x,x*x*x)
   //  }   
   
   //Exercise
   // def grocery(order:Int) : (Double,Double)  = {
   //   var discount = if (order > 200) 25 else 0
   //   var disc_amt = discount*order/100
   //   var tax = 0.07*(order - disc_amt)
     
   //   return (disc_amt,tax)
   //   }

   // Named Arguments
   // def f( x:Int = 5, y:Int = 7 ) : Int = {
   //    return 2*x+3*y
   // }

   // Variable Arguments
   // def sum(x:Int*) : Int = {
   //    var s:Int = 0
   //    for (i <- x) {
   //        s = s + i 
   //      }
   //    return s
   //   }
   
   //Exercise
   //  def min(x:Int*) : Int = {
   //    var m:Int = x(0)
   //    for (i <- x) {
   //        if (i<m) {
   //        m = i
   //      }
   //    }
   //    return m
   //   }

   // Anomalous Function
   //   def f( x:Int ) : Int = {
//      return x*x
//    }    
//  var f = (x:Int) => x*x
  
//   def f( x:Int,y:Int ) : Int = {
//      return 10*x+y
//    }    
//   
//   var f =  (x:Int,y:Int) => 10*x+y
   
  // val double = (i:Int) => i * 2                   
  // val triple = (i:Int) => i * 3                   
  
  // def f(x:Int, y:Int=>Int) = y(x)       
                         
   //Closure
   // var factor = 2
   // var f = (x:Int) => x*x*factor
   
   // Recursive Function
   // def factorial(n:Int):Int = if(n<=0) 1 else n * factorial(n-1) 
}
}