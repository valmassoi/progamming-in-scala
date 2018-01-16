//scala listings-3.3.scala
// unlike arrays each element are also immutable
// val oneTwoThree = List(1, 2, 3)

val oneTwo = List(1,2)
val threeFour = List(3,4)
val oneTwoThreeFour = oneTwo ::: threeFour // list concatenation
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")

val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree // :: is called "cons"
// cons prepends a new element to beging of an existing list and returns the resulting list
// because the method ends in a colon it acts on the right operand
// as in: twoThree.::(1)
// oneTwoThree(1) = 5 would throw error: value update is not a member of List[Int]
println("oneTwoThree " + oneTwoThree)

// shorthand way to specify empty list is Nil
// val oneTwoThree = 1 :: 2 :: 3 :: Nil

// NOTE: append is :+
// but prepending is much more efficient
// better to prepend and reverse later
// or use ListBuffer