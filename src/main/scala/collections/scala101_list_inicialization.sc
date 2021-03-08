val lista = List(1,2,3)
val listb = 4 :: 5 :: 6 :: Nil
// val listb = ((Nil.::(6)).::(5).::(4)
// :: is right associative in scala
// any operator ending in : is right associative

// ::: concatenate two lists, is right associative
val listc = lista ::: listb