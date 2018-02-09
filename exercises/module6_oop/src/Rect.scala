class Rect2(l:Int,w:Int) { 
  var length = l
  var width = w
  
  def area() : Int = {
    return length*width
  } 
}

object test {
    def main(args: Array[String]) {
      var a1 = new Rect2(10,20)  
      println(a1.area())
    }   
}