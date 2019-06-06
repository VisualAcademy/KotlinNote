
// 인터페이스
interface IPerson {
    fun work()
}

// 클래스
class Person : IPerson {
    // 다시 정의(new)
    override fun work() = println("일을 합니다.")
}

// 메인
fun main(args: Array<String>) {
    val person = Person()
    person.work() // 일을 합니다. 
}
