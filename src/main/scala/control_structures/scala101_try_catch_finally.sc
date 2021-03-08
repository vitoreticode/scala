// try catch finally is an expression
// the result is decided on try catch blocks
// if present, finally blocks always run, but dont affect the result of type

val args = Array.empty[String]
val filename2 =
  try{
    args.head // throws exception on empty array
  }
  catch{
    case _: NoSuchElementException => "default.txt"
  }
  finally {
    println("banana")
    "the finally block"
  }