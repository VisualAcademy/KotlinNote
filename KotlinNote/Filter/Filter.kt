fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5);

    //val nums = numbers.filter{ it < 3 }; // 3보다 작은
    //val nums = numbers.filter{ it % 2 == 0 }; // 짝수
    val nums = numbers.filter{ 
        it % 2 == 1 && it > 3
    }; // 홀수 && 3보다 큰

    for (i: Int in nums) {
        println(i);
    }
}
