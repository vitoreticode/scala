// Arrays are mutable

val arr = Array("scooby","dooby","doo")
arr(0) = "scrappy"
arr(1) = "dappy"

arr.mkString(" ")

new Array[String](3) // assign with nulls

// Lists and Vectors are not mutable

val xs1 = List(1,2,3)
val xs2 = 0 :: xs1 // return a new list

// Set has both implementations
import scala.collection._

val s1 = mutable.Set(1,2,3)
val s2 = immutable.Set(1,2,3)
s1 += 4 // using re-writting rule

// its not recommended to use a var and a mutable collection together

/**
 * 1 - Statements, side-effects, vars and mutability are not functional programming style
 * 2 - Instead, aim for expressions, vals and mutability
 * 3 - Use vars or mutability when dictated by performance or others factors
 * 4 - You dont need a var with a mutable collection, choose one or another
 * 5 - Dont let the mutability escape into the API
 * 6 - Dont optimize for performance prematurely
 * 7 - Keep methods short and uncomplicated
 *
 *
 *
 *
 *
 */
/


