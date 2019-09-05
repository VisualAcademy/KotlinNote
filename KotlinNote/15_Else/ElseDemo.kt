fun main(args: Array<String>) {
    val score = 80
    
    val result = if (score >= 80) {
        println("합격");
        "합격";
    } else {
        println("불합격");
        "불합격";
    }
    
    println("$result");    
}
