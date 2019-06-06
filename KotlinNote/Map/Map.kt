fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5);

    // -> : goes to 
    val nums = numbers.map{ it * it };

    for (i: Int in nums) {
        println(i);
    }

    val nums2 = 
        numbers
            .filter{ it -> it < 3 }
            .map{ it -> it * it };

    for (i: Int in nums2) {
        println(i); // 1, 4
    }            
}
