fun addTwo(x: Int): Int {
    return x + 2;
}

fun addThree(x: Int) = x + 3;

fun main(args: Array<String>) {
    println(addTwo(10)); // 12
    println(addTwo(20)); // 22

    println(addThree(5)); // 8
    println(addThree(7)); // 10
}

