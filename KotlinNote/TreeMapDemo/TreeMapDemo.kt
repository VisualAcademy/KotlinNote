import java.util.*;

fun main(args: Array<String>) {
    var members = java.util.TreeMap<String, Int>();
    members["홍길동"] = 21;
    members["백두산"] = 100;
    members["임꺽정"] = 40;

    for ((name, age) in members) {
        println("$name : $age");
    }
}
