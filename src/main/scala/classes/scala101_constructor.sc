class DemoWithParams(name: String) {
  println(s"Constructing $name")

  def sayHi(times: Int): Unit = {
    var time = 0

    while(time < times) {
      println(s"Hi $name")
      time += 1
    }
  }
}

// Params on the class become primary constructor parameters
// Code in the class(not in defs) become the primary constructor code,
// runs when a new instance is constructed
// Can't access the constructor parameters from outside (private)

val demo = new DemoWithParams("Jill")
//can't access
//demo.name