object Demo1 {
    
    // 函数定义
    def first_function(arg:String): Unit = {
        println(s"传入的参数是:$arg")
    }
    
    def main(args: Array[String]): Unit = {
        // 函数可以定义在main方法内
        def second_function(arg:String): Unit = {
            println(s"传入的参数是:$arg")
        }
        first_function("Hello World")
        second_function("Hello World2")
    }
}
