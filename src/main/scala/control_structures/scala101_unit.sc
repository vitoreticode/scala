import java.io.{File, PrintWriter}

/**
 * 1 - A Unit return type implies that a method must have a side effect to do something useful
 * 2 - A non unit return type does not imply that there are no side effects
 * 3 - Many built in constructors in scala are expressions rather than statements, few return only Unit
 * 4 - Unit is descend from AnyVal like the "primitive" types
 * 5 - Return this instead Unit
 */

class WriterOutput(writer: PrintWriter) {
  def write(s: String): Unit = writer.println(s)
}

val ex1 = new PrintWriter(new File("ex1.txt"))
val out1 = new WriterOutput(ex1)

out1.write("hello")
out1.write("to")
out1.write("you")

ex1.close()

class WriterOutput2(writer: PrintWriter) {
  def write(s: String): WriterOutput2 = {
    writer.println(s)
    this
  }
}

val ex2 = new PrintWriter(new File("ex2.txt"))
val out2 = new WriterOutput(ex2)

out2.write("hello").write("to").write("you")

ex2.close()
