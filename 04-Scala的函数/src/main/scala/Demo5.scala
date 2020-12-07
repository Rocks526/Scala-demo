// 高阶函数
object Demo5 {
    def main(args: Array[String]): Unit = {
        //高阶函数————函数作为参数
        def calculator(a: Int, b: Int, operator: (Int, Int) => Int): Int = {
            operator(a, b)
        }
    
        //函数————求和
        def plus(x: Int, y: Int): Int = {
            x + y
        }
    
        //方法————求积
        def multiply(x: Int, y: Int): Int = {
            x * y
        }
    
        //函数作为参数
        println(calculator(2, 3, plus))
        println(calculator(2, 3, multiply))
    }
}
