import scala.annotation.tailrec

def greet(n: Int): Unit = {
  var i = 0
  while(i < n) {
    println("Hello")
    i += 1
  }
}

greet(5)

@tailrec
def greetTailRec(n: Int, curr: Int = 0): Unit = {
  if(curr < n){
    println("Hello")
    greetTailRec(n, curr + 1)
  }
}