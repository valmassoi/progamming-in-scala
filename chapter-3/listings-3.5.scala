//scala listings-3.5.scala
//set and maps (collection classes) have both imm and mutable traits

var jetSet = Set("Boeing", "Airbus") // immutable
jetSet += "Lear" // reassigning jetSet var to a new immutable set
println(jetSet.contains("Cessna"))