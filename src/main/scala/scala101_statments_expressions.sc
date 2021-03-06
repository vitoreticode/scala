// val/var also produce Unit return types
var x = 5
val y = x = 10
println(x)
println(y)

// a common mistake is ending a code block with a val

def add(a: Int, b: Int): Int = {
  val result = a + b
  result
}

