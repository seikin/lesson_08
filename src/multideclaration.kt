/*классы данных*/
fun main () {
    val a = DataBook1("Пикник на обочине","Стругацкие", 1995)
    val b = DataBook1("Многрукий бог далайна","Логинов", 1992)
    val c = DataBook1("Пикник на обочине","Стругацкие", 1995)
    val d = a.copy(title = "Сталкер")
    val i = readLine()!!.toString()


    /*перебор мультидекларации*/
    val x = listOf<DataBook1>(a,b,c,d)

    for ((title, author, year) in x) {
        println(title)
        println(author)
        println(year)
    }

    }

//    /*multideclaration. распаковка одного класса к нескольким переменным*/
//    val (title, author, year) = a
//    println(title)
//    println(author)
//    println(year)
//
//}

/*к дата классам компилятор прибавляет методы
tostring, equals, tohash
 */
data class DataBook1(val title: String, val author: String, val year: Int) {
    init {
        println("Создана экземпляр книги")
    }
    override fun toString(): String {
        return "$title, $author, $year"
    }
}

class Book1 (val title: String, val author: String, val year: Int) {
//    operator fun component1() = title
//    operator fun component1() = author
//    operator fun component1() = year
}