for(i <- 1 to 10) println (i * i)

(1 to 10).foreach(i => println(i * i))

for(i <- 1 to 3; j <- 1 to 3) println(i * j)

for{
  i <- 1 to 3
  j <- 1 to 3
} {
  println(i * j)
}

// more idiomatic fors

val squares  = for(i <- 1 to 10) yield i * i

(1 to 10).map(i => i * i)