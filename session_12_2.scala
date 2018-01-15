import scala.collection.mutable.ListBuffer

class session_12_2 {

  var container = List("alpha","gamma","omega","zeta","beta");
  var i=0;

  def first():Unit={
    println("String with length 4 :")
    for (i <- 0 to (container.length-1)) {
    if (container(i).length == 4)
      println(container(i))
  }
  }

  def second():Unit={
    var temp = new ListBuffer[String]()
    for (i <- 0 to (container.length-1)){
      temp += container(i).length.toString
    }
    container = temp.toList
    println("new List is "+ container)
    container = List("alpha","gamma","omega","zeta","beta");
  }

  def third():Unit={
         println("count of strings with \"m\" is " + container.count(s => s.indexOf("m")!= -1))
  }

  def fourth():Unit={
    println("count of strings with \"m\" is " + container.count(s => s.indexOf("a")== 0))
  }

}

object exec extends App{
  var define = new session_12_2
  println("The List on which we will be working : " + define.container.mkString(" , ") )
  var first = define.first()
  var second = define.second()
  var third = define.third()
  var fourth = define.fourth()
}


