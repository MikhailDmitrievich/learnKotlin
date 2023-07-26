fun main() {

    // конкатенация строк (складывание строк)

    val greetings = "Здравствуйте"
//    val space = ' '
    val userName = "Михаил Дмитриевич"

//    println(greetings + "," + space + userName + "!" + space + "Какой будет ваш главный вопрос?")

    // интерполяция строк (включение значений переменных/констант по их названию в строковый литерал)

//    println("$greetings, $userName! Какой будет ваш главный вопрос?")
//    println("Посчитаем сумму 40 + 2 = ${40 + 2}")

    // многострочный текст
//    val multiString = """
//            String 1
//        String 2
//                String 3
//    """.trimIndent() // удаление минимального отступа
//    println(multiString)

    val multiString = """
            |String 1
        |String 2
                |String 3
    """.trimMargin() // отформатировать по левому краю
    println(multiString)
}