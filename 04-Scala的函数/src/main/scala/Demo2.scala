object Demo2 {
    def main(args: Array[String]): Unit = {
        // 函数1：无参，无返回值
        def test(): Unit ={
            println("无参，无返回值")
        }
        test()
    
        // 函数2：无参，有返回值
        def test2():String={
            return "无参，有返回值"
        }
        println(test2())
    
        // 函数3：有参，无返回值
        def test3(s:String):Unit={
            println(s)
        }
        test3("demo")
    
        // 函数4：有参，有返回值
        def test4(s:String):String={
            return s+"有参，有返回值"
        }
        println(test4("hello "))
    
    
        // 函数5：多参，无返回值
        def test5(name:String, age:Int):Unit={
            println(s"$name, $age")
        }
        test5("rocks",22)
    }
}
