/*hometask #08 by alexey seikin*/

//
//подскажите как автоматизировать генерацию экземпляров класса?
//как будет выглядет внесение новых экземпляров в существующий список?
//как применить корректно break и continue?

//в идеале я хочу заполнять данными автоматически генерящиеся экземпляры data класса, которые добавляются в
//список, пока не будет введена команда return/

//1. Создать data class хранящий в себе какую-то информацию например книга, автомобиль, смартфон и т.д.
//2. Создать пустой список объектов данного класса.
//3. Пользователь должен сам наполнить список при помощи консоли.
//4. Если пользователь вводит в консоль слово return,
// вывести все данные из списка в консоль воспользовавшись циклом for и мультидекларацией
fun main() {
    println("создаем 3 книги")
    val book01 = FavoriteBook("title","author",0)
    book01.readliner()
    val book02 = FavoriteBook("title","author",0)
    book02.readliner()
    val book03 = FavoriteBook("title","author",0)
    book03.readliner()

    println("введите return для вывода всех данных из списка в консоль")

    when (readLine()!!.toString()) {
    "return" -> {
        /*перебор мультидекларации*/
        val booksList: List<FavoriteBook> = listOf(book01,book02,book03)

        for ((title, author, year) in booksList) {
            println(title)
            println(author)
            println(year)
        }
    }

}


}

data class FavoriteBook(var title: String, var author: String, var year: Int){
    init {
        println("Создаем книгу")
    }
    fun readliner(){
        print("Ведите название книги: ")
        title = readLine()!!.toString()
        print("Введите автора книги: ")
        author = readLine()!!.toString()
        print("Введите год издания: ")
        year = readLine()!!.toInt()
        println("Создана новая книга ${hashCode()}")
        println()
    }
}

