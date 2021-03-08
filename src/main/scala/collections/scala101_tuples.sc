def sumDifference(a: Int, b: Int): (Int, Int) = {
  val sum = a + b
  val diff = a - b
  (sum, diff)
}

val res = sumDifference(10, 5)
// access each item in a tuple separatelly
res._1
res._2

val (sm, df) = sumDifference(10, 5)

// tuple unpacking
val tup5 = (0, 'u', 8, 1, "foo")

val (a,b,c,d,e) = tup5

// tuples arity = 22