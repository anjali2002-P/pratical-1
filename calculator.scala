

class MyCalculator {
  
        def add(x:Int, y:Int) = x + y;
        
        def sub(a: Int, b: Int): Int = a-b
      
        def mul(a: Int, b: Int): Long = a*b
      
        def div(a: Int, b: Int): Int = 
        {
            require(b != 0, "denominator can not be 0")    
            a/b
        }
}
        
object Calendar {
    def main(args: Array[String]) {
        val calc = new MyCalculator()
        println("sum of x + y = " + calc.add(25,10));
        println("sub of x - y = " + calc.sub(25,10));
        println("mul of x * y = " + calc.mul(25,10));
        println("div of x / y = " + calc.div(25,10));
    }
}
