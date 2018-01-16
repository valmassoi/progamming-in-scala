import ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]): Unit = {
    for (arg <- args) {
      println(arg + ": " + calculate(arg))
    }
  }
}

// compile with: fsc ChecksumAccumulator.scala Summer.scala
// kill with: fsc -shutdown
// run: scala Summer of love