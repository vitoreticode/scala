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

// an expression has a return value, a statement does not
// a pure expression has no effects other than those
// seen in the return values

// an expression
val a = 1 + 2
// a statement
println(a)



