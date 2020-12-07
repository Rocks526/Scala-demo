import util.control.Breaks._

object Demo6 {
    def main(args: Array[String]): Unit = {
        var i = 0
        while (i < 10){
            breakable {
                i = i+ 1
                if (i == 5){
                    break()
                } else {
                    println(s"i = $i")
                }
            }
        }
    }
}
