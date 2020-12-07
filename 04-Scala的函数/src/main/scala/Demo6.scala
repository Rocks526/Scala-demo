// 匿名函数
object Demo6 {
    //高阶函数————函数作为参数
    def calculator(a: Int, b: Int, operator: (Int, Int) => Int): Int = {
        operator(a, b)
    }
    
    //函数————求和
    def plus(x: Int, y: Int): Int = {
        x + y
    }
    
    def main(args: Array[String]): Unit = {
        
        //函数作为参数
        println(calculator(2, 3, plus))
        
        //匿名函数作为参数
        println(calculator(2, 3, (x: Int, y: Int) => y - x))
        
        //匿名函数简写形式
        println(calculator(2, 3, _ - _))
    }
}
