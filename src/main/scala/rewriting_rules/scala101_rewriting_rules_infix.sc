// scala has no operators
val a = 1 + 2

val b = 1.+(2)

// infix notation = methods on a instance with one parameter
val s = "Hello"
s.charAt(0)
s charAt 0

// other example of infix notation re-written rules
List(1,2,3).map(_ * 2)
List(1,2,3) map (_ * 2)

// doesent work in pre defined functions
// println "hello"

System.out println "hello"