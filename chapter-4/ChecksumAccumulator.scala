//scala ChecksumAccumulator.scala hi hello
import scala.collection.mutable

class ChecksumAccumulator { // companion class
    private var sum = 0
    def add(b: Byte): Unit = { sum += b }
    def checksum(): Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator { // Singleton companion object (if defined in same source file) and can access private members
    private val cache = mutable.Map.empty[String, Int] // could use WeakHashMap for garbage collection if low on memory, uses more mem but less cpu
    def calculate(s: String): Int = {
        if (cache.contains(s))
            cache(s)
        else {
            val acc = new ChecksumAccumulator
            for (c <- s) // char in string
                acc.add(c.toByte)
            val cs = acc.checksum()
            cache += (s -> cs) // add to cache
            println(cache)
            cs // return checksum
        }
    }
}

// singleton objects are the home for static methods that Java would have used

// println(ChecksumAccumulator.calculate(args(0)))
// println(ChecksumAccumulator.calculate(args(1)))

// standalone objects dont have a companion class and are used for:
// collection related utility methods
// defining entry point in app