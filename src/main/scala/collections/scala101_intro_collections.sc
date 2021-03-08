// Arrays are mutable, Lists are immutable

// Both have a type parameter
val arr1:Array[Int] = Array(1,2,3)
val list1: List[String] = List("scooby","dooby","doo")

// type parameter is not optional, but can be inferred from inicialization contents
val arr2 = Array(1,2,3)
val list2 = List("scooby","dooby","doo")

// when specifying a collection type in a method parameter, the type parameter must be provided
def squareRootsOf(xs: List[Int]): List[Double] =
  for(x <- xs) yield math.sqrt(x)

val list3 = List(1,2,3)

squareRootsOf(list3)