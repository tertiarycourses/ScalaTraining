//Module 5 Function
//Author: Dr. Alfred Ang

object module5_2 {
   def main(args: Array[String]) {
//     print(f2(3))
     
     var (discount,tax) = grocery(300)
     println(discount)
     println(tax)
    }
   
   def f2(x:Int ) : (Int,Int) = {
      return (x*x,x*x*x)
    }    
   
   def grocery(order:Int) : (Double,Double)  = {
     var discount = if (order > 200) 25 else 0
     var disc_amt = discount*order/100
     var tax = 0.07*(order - disc_amt)
     
     return (disc_amt,tax)
   }

    
}