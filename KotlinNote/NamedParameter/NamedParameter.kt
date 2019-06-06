fun main(args: Array<String>) {
    sum(10, 20); // 30
    sum(first = 10, second = 20); // 30
    sum(second = 20, first = 10); // 30
}

// 명명된 인수(Named Parameter)
fun sum(first: Int, second: Int) {
    println(first + second);
}
