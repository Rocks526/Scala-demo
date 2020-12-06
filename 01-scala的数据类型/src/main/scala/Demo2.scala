object Demo2 {

  def main(args: Array[String]): Unit = {

    // 变量声明不指定初始化值会报错
//    var age

    // 声明int类型的age变量 这两种方式等效
    var age = 18
    var age2:Int = 18

    // var代表可变变量  val代表不可变变量  如果是类属性，通过final限制 局部变量只能通过语法限制
    val age3 = 18

    age = 20
    println(age)

    // 编译会报错
//    age3 = 20

  }

}
