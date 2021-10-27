/*множественное наследование реализовано через интерфейсы*/
fun main() {
    val n = NumberInt(10, 8)
    n.incStep(10)
    n.print()

}

interface Step {
    fun incStep(s: Int)
}

abstract class Inc {}

interface Num {}

interface Math {
    fun print() {
        println("Info")
    }
}


class NumberInt(n: Int, s: Int): Inc(), Step, Num, Math {
    var number = n
    var step = s

    fun inc() { number += step}
    fun dec() { number -= step}
    override fun incStep(s: Int) {
        number *= step
    }

    override fun print() {
        println("overriden info")
    }
}
