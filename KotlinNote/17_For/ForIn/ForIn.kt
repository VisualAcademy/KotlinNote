fun main(args: Array<String>) {
    for (i in 1..5) {
        println(i);
    }
    for (i in 1..5 step 2) {
        println(i);
    }
    for (i in 5 downTo 1) {
        println(i);
    }    
    for (i in 1 until 5) {
        println(i);
    }    
	for (c in "HelloWorld") {
		println(c);
	}
	for (item in 1.rageTo(5).step(2)) {
		println(item); 
	}
}
