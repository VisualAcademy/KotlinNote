interface ICar {
    fun go();
}

class Car : ICar {
    // Override: 새롭게 정의, 다시 정의
    override fun go() {
        println("Go() 메서드를 구현하였습니다.");
    }
}

fun main(args: Array<String>) {
    var car = Car();
    car.go();
}
