fun main(args: Array<String>) {
    val str = "안녕하세요.";

    println(Three(str));                // "안녕하"
    println(str.ThreeEx());             // "안녕하"
    println("반갑습니다.".ThreeEx());    // "반갑습"
}

// 함수
fun Three(value: String) : String {
    return value.substring(0, 3);
}

// 확장 함수(Extension Function): String 클래스에 확장 함수를 추가
fun String.ThreeEx() : String {
    return this.substring(0, 3);
}
