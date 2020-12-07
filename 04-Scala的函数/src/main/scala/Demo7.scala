object Demo7 {
    
    val sum = (x: Int, y: Int, z: Int) => x + y + z
    
    val sum1 = (x: Int) => {
        y: Int => {
            z: Int => {
                x + y + z
            }
        }
    }
    
    val sum2 = (x: Int) => (y: Int) => (z: Int) => x + y + z
    
    def sum3(x: Int)(y: Int)(z: Int) = x + y + z
    
    def main(args: Array[String]): Unit = {
        // 外部变量
        var x: Int = 10
    
        // 闭包
        def f(x: Int, y: Int): Int = {
            x + y
        }
        // 匿名函数
        sum(1, 2, 3)
        sum1(1)(2)(3)
        sum2(1)(2)(3)
        sum3(1)(2)(3)
    }
}
