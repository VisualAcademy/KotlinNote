fun multi(vararg params: String) {
    for (s: String in params) {
        print(s + " ");
    }
    println();
}

fun main(args: Array<String>) {
    multi("A");
    multi("A", "B");
    multi("A", "B", "C");
}
