object Demo2 {
  def main(args: Array[String]): Unit = {
//    for(i <- 1 to 10){
//      println(s"循环次数:$i")
//    }
//    for(i <- 1 until 3){
//      println(s"循环次数:$i")
//    }
//    for (i <- 1 to 10 if i != 5) {
//      println(i + "")
//    }
//    for (i <- 1 to 10) {
//      if (i != 5){
//        println(i + "")
//      }
//    }
//    for (i <- 1 to 10 by 2) {
//      println("i=" + i)
//    }
//      for (i <- 1 to 3; j<- 1 to 3){
//        println(s"i=$i, j=$j")
//      }
//    for (i <- 1 to 3; j = i + 2){
//      println(s"i=$i, j=$j")
////    }
//    for {
//      i <- 1 to 3
//      j = i + 2
//    }{
//      println(s"i=$i, j=$j")
//    }
      val res = for(i <- 1 to 10) yield i
      println(res)
  }
}
