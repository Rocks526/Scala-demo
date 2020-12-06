object Demo3 {

  def main(args: Array[String]): Unit = {

    var name:String = "Rocks"
    var age:Int = 22
    // 与Java的标准输出类似，编译后会变成Java的标准输出
    println(name + " " + age)

    // 与C的语法类似 通过占位符赋值
    printf("name = %s, age = %d\n", name, age)

    // 通过$引用变量，需要在字符串前加s
    println(s"name = $name, age = $age")

    // Scala支持文本块
    print(
      s"""
         name = $name
         age = $age
         """.stripMargin)

  }

}
