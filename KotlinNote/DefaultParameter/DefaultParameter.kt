fun main(args: Array<String>) {
    log("디버그");
    log("에러", 4);
}

// 기본 매개 변수: 매개 변수 선언과 동시에 초기화
fun log(message: String, level: Int = 1) {
    println("$message, $level");
}
