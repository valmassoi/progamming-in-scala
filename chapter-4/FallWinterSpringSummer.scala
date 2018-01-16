import ChecksumAccumulator.calculate

object FallWinterSpringSummer extends App { // extending App removes need for def main()
  for (season <- List("fall", "winter", "spring")) {
    println(season + ": " + calculate(season))
  }
}
