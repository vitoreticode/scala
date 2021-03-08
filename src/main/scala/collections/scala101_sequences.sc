// List and Array are both sequences in scala, subtypes of Seq
// There are others, like Vector
val v = Vector(1,2,3,4)

// all can be passed into a method requiring a Seq
def squareRootOfAll(xs: Seq[Int]): Seq[Double] = {
  xs.map(x => math.sqrt(x))
}

val lista = List(1,2,3)
val listb = 4 :: 5 :: 6 :: Nil
val array2 = Array(1,2,3)

squareRootOfAll(v)
squareRootOfAll(listc)
squareRootOfAll(array2)