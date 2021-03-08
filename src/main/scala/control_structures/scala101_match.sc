// like switch case in java
val x = 1

val res = x match {
  case 1 => "one"
  case 2 => "two"
  case _ => "Something else"
}

// match expressions guards
// the progression of tests only continues until the first match of everything to the left of the =>

val n = -1

n match {
  case 0 => "its zero"
  case v if n > 0 => s"Its negative $v"
  case v => s"Its negative ${v.abs}"
}

def matchIt(x: Any): String = x match {
  case "Hello" => "Well, hello back"
  case 1 :: rest => s"a list beggining with 1, rest is $rest"
}