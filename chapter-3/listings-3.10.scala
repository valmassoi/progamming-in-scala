//scala listings-3.10.scala listings-3.10.scala
import scala.io.Source

if (args.length > 0) {
    for (line <- Source.fromFile(args(0)).getLines())
        println(line.length + " " + line)
}
else
    Console.err.println("Please enter filename")