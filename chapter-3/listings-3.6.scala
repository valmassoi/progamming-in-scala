//scala listings-3.6.scala
import scala.collection.mutable
import scala.collection.immutable.HashSet // more explicit
//factory method on its companion object

val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shreck"
println(movieSet)

val hashSet = HashSet("Tomatoes", "Chilies")
println(hashSet + "Coriander")