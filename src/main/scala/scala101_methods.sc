def max(a: Int, b: Int): Int =
  if(a > b) a else b

def min(a: Int, b: Int): Int =
  if(a < b) a else b

def sayHi(name: String): Unit =
  println(s"hello $name")

sayHi("Lucas")

def procedureSyntax(name: String): Unit = {
  println(s"hello $name")
}

def add(a: Int, b: Int): Int = {
  a + b
}