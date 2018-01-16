// run: scala echoargs.scala Scala is more funnn
var i = 0
while (i < args.length) {
    if (i != 0)
        print(" ")
    print(args(i))
    i += 1
}
println()