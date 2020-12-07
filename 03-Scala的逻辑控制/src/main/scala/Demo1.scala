import scala.io.StdIn

object Demo1 {
  def main(args: Array[String]): Unit = {

    println("请输入成绩")
    val grade = StdIn.readInt()

    if (grade == 100){
      println("成绩为100分")
    }else if (grade > 80 && grade <= 90){
      println("成绩大于80，小于90")
    }else{
      println("成绩小于80")
    }

    var res = 50
    res = if (res > 60) res else 60
    println(res)

  }

}
