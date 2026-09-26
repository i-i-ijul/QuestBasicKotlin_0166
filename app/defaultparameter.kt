fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main() {
    printMessageWithPrefix("Hello Ijul Ganteng", "Log")

    printMessageWithPrefix("Hello Ijul Ganteng")

    printMessageWithPrefix(prefix = "Log", message = "Hello Ijul Ganteng")
}
