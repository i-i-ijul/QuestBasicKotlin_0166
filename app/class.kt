class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "izzul@gmail.com")

    println(contact.email)

    contact.email = "haqqi@gmail.com"

    println(contact.email)
}
