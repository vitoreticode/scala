// A Map can be thought of as an associative sequence of tuples,
// the first item of the tuple can be used to look up the second item

// Like sets, Maps has both mutable and immutable implementations

import scala.collection._
val m1 = mutable.Map('a' -> 1, 'b' -> 2, 'c' -> 3)
var m2 = immutable.Map('d' -> 4, 'e' -> 5, 'f' -> 6)

// updating maps
m1 ++ m2
m2 += 'g' -> 7

// extention map ->
// -> can be called on instance of any type with one parameter of any other type
// the result is a tuple[firstType,secondType] with the values of both instances
// its mainly syntatic sugar for creating maps, but its not a keyword

1 -> "one"
1.->("one")
ArrowAssoc(1).->("one")

val mapToRiches = Map(
  1 -> "steal underpants",
  2 -> "???",
  3 -> "profit"
)

for((step, instruction) <- mapToRiches) {
  println(s"Step $step $instruction")
}

