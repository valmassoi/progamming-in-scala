//scala listings-3.7.scala
import scala.collection.mutable
// dont need to import if immutable (default)
val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (5 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(5))