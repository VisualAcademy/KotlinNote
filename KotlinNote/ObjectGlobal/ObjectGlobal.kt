
object Global {
    val PI: Double = 3.14;
    val longValue = 10L;
}

fun main(args: Array<String>) {
    println(Global.PI);
    println(Global.longValue);
    helloWorld("안녕하세요.");
    println(addNumbers(3, 5)); 

    unlimited("1");
    unlimited("1", "2");
}

fun helloWorld(message: String): Unit {
    println(message);
}

fun addNumbers(x: Int, y: Int): Int {
    return x + y;
}

fun addNumbers2(x: Int, y: Int) = x + y;


fun unlimited(vararg strings: String) {

}

fun String.welcome(name: String) {
    println("Welcome $name"); 
}

fun String.shouldEqual(value: string): Boolean {
    return value == this;
}

