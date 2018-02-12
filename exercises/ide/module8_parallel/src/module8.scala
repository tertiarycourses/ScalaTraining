object module8 {
  
  def main(args: Array[String]) {
   
//    var a = 1 to 100
//    var pa = a.par
//    
//    import scala.collection.parallel.immutable.ParVector
//    
//    val pvec = ParVector.range(0,200)
    
    val a = (1 to 100).toArray
    val v = a.par
    
    // print(v.map(_*2))
    print(v.map(square(_)))
  }
  
   def square(x:Int) : Int = {
       return x*x
     }       
  

  
}