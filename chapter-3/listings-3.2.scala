//scala listings-3.2.scala
val numNames = Array("zero", "one", "two")
// or: val numNames = Array.apply("zero", "one", "two")

for (i <- 0 to 2)
    print(numNames(i))