class Demo

class DemoWithFieldAndMethods {
  val x = 10
  val y = x * 2

  def timesY(a: Int): Int = a * y
}

val demoWithFieldAndMethods = new DemoWithFieldAndMethods
demoWithFieldAndMethods.timesY(4)

class DemoWithParams(name: String) {
  println(s"Contructing for $name")

  def sayHi(times: Int): Unit = {
    var time = 0

    while(time < times) {
      println(s"Hi $name")
      time += 1
    }
  }
}

val demoWithParams = new DemoWithParams("Val")
demoWithParams.sayHi(5)