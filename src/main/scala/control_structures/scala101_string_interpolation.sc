val x = 10
val y = 2.12
val name = "Fred"
s"$name $x $y"
s"$name is ${x * y}"
f"$name is ${x * y}%08.4f"

// f interpolation follows the printf notation
// raw does not escape literals in the string

"\t\n"
raw"\t\n"
""""\t\n""""

val s =
  """
    |Fred took a "dive"
    |and Jill Followed
    |""".stripMargin

println(s)