//scala listings-3.9.scala arg1 arg2 arg3
def formatArgs(args: Array[String]) = args.mkString("\n")
println(formatArgs(args))

//above is purely functional because it doesnt have any vals or side effects in the function like below
// def printArgs(args: Array[String]): Unit = {
    // args.foreach(println)
// }