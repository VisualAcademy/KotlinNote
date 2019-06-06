class Messenger {
    fun printMessage(message: String, prefix: String = "", suffix: String = "") {
        println("$prefix$message$suffix")
    }
}

fun main(args: Array<String>) {
    val msg = Messenger()

    msg.printMessage("My")
    msg.printMessage(message= "My ", prefix= "Oh ")
    msg.printMessage(message= "My ", prefix= "Oh ", suffix = "God")
}


