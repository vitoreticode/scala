import scala.io.Source

for(line <- Source.fromFile("somefile.txt").getLines()){
  println(line)
}

// Source not used in production code, prefer java io
