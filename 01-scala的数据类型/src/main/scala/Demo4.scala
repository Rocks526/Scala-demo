import scala.io.StdIn

object Demo4 {
  def main(args: Array[String]): Unit = {
    println("请输入姓名:")
    val name = StdIn.readLine()
    println("请输入年龄:")
    val age = StdIn.readShort()
    println("请输入薪水:")
    val sal = StdIn.readDouble()
    println(s"姓名:$name, 年龄:$age, 薪水:$sal")
  }
}
