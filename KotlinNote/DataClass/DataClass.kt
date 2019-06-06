data class Customer(val id: Int, var name: String, var city: String)

fun main(args: Array<String>) {
    val customer = Customer(id = 1, name = "홍길동", city = "서울")

    println(customer.id.toString() + ", " + customer.name + ", " + customer.city)
}
