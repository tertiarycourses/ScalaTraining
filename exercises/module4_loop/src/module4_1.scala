object Demo {
   def main(args: Array[String]) {
//   var a = 1
//   while( a < 10 )
//     {
//         println( "Value of a: " + a )
//         a += 1
//      }
//   
   var a = 0
   var b = 1
   var temp = 0
   
   while (a<100) {
     temp = a
     a = b
     b = temp+b
     println(a)
   }
   
   }
}
