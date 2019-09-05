fun main(args: Array<String>) {
    println("Hello Kotlin")

    var numbers = listOf(1, 2, 3, 4, 5)

    for (num: Int in numbers) {
        println(num)
    }

    var nums = numbers
        .filter{ it -> it % 2 == 0 }
        .map{ it -> it * it }

    for (num: Int in nums) {
        println(num) // 4, 16
    }
}
