import util.control.Breaks._
object Demo5 {
  def main(args: Array[String]): Unit = {
    var i = 0
    breakable {
      while (i < 10){
        println(s"i = $i")
        i = i + 1
        if (i == 5){
          break()
        }
      }
    }
  }
}
