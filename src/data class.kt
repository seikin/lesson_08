/*классы данных*/
fun main () {
    val a = DataBook("Пикник на обочине","Стругацкие", 1995)
    a.readliner()
    print("Название: ")
    val atitle = readLine()!!.toString()
    print("Автор: ")
    val aauthor = readLine()!!.toString()
    print("Год: ")
    val ayear = readLine()!!.toInt()
    val a1 = DataBook(atitle,aauthor,ayear)

    println("Созданая книга ${a1.hashCode()} выглядит так: $a1")

    val b = DataBook("Многрукий бог далайна","Логинов", 1992)
    val c = DataBook("Пикник на обочине","Стругацкие", 1995)
    val d = a.copy(title = "Сталкер")

/*copy*/
    println(d)
    println(a.hashCode())

/*equals*/
    println(a == c)
    println(a.equals(c))
    println(a == b)


/*tostring*/
    println(a)
    println(b)

}
/*к дата классам компилятор прибавляет методы
tostring, equals, tohash
 */
data class DataBook(var title: String, var author: String, var year: Int) {
    init {
        println("Создана книга ${hashCode()}")
    }
    fun readliner(){
        print("Название: ")
        title = readLine()!!.toString()
        print("Автор: ")
        author = readLine()!!.toString()
        print("Год: ")
        year = readLine()!!.toInt()

    }


}

class Book (val title: String, val author: String, val year: Int)