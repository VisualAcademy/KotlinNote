fun main(args: Array<String>) {
    var p1 = Person("홍길동")
    println(p1.name)

    var s1 = Student(1, "백두산")
    println("${s1.id} : ${s1.name}")

    var s2 = Student(2, "임꺽정")
    println("${s2.id} : ${s2.name}")
}

class Person(val name: String) {

}

class Student(val id: Int, val name: String) {

}
