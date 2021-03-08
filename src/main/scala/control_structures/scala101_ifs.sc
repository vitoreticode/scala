// in scala if is an expression
// the return type is the combination of the types on both sides of else
val args = Array(1,2,3)
val filename = if (args.length > 0) args(0) else "default.txt"

